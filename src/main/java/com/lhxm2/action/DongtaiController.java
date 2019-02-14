package com.lhxm2.action;

import com.lhxm2.dto.DongTaiDTO;
import com.lhxm2.pojo.Dongtai;
import com.lhxm2.pojo.DongtaiPic;
import com.lhxm2.service.DongtaiPicService;
import com.lhxm2.service.DongtaiService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class DongtaiController {

    @Autowired
    private DongtaiService dongtaiService;
    @Autowired
    private DongtaiPicService dongtaiPicService;

    /**
     *发布动态
     */
    @RequestMapping("/world/adddynamic")
    public Map uploadFile(DongTaiDTO dongTaiDTO,MultipartFile file,HttpServletRequest request) throws IOException{
        Dongtai dongtai = dongtaiService.addDongtai(dongTaiDTO);

        if(!file.isEmpty()){
            String fileName = file.getOriginalFilename();
            String extensionName = StringUtils.substringAfter(fileName,".");
            //生成新的guid的文件名
            String newFileName = System.currentTimeMillis()+ "."+extensionName;
            String url = "E:";
            Path filePath = Paths.get(url, newFileName);
            //保存到相应的路径下
            Files.copy(file.getInputStream(), filePath);
            DongtaiPic dongtaiPic = new DongtaiPic();
            dongtaiPic.setDpicUrl(url+newFileName);
            dongtaiPic.setDtId(dongtai.getDtId());
            dongtaiPicService.insert(dongtaiPic);
            Map map = new HashMap();
            map.put("code","0");
            return map;
        }else{
            return null;
        }
    }
    /*public void addDongTai(DongTaiDTO dongTaiDTO,
                           @RequestParam MultipartFile uploadfile,
                           HttpServletRequest request){
        dongtaiService.addDongtai(dongTaiDTO);
        DongtaiPic dongtaiPic = new DongtaiPic();
        try {
            //1.上传文件
            String url = request.getRealPath("/static/upload");
            //2.拼接路径
            String path =url+"/"+uploadfile.getOriginalFilename();
            uploadfile.transferTo(new File(path));
            //3.设置数据库的文件路径
            dongtaiPic.setDpicUrl("/static/upload/"+uploadfile.getOriginalFilename());
            dongtaiPic.setDtId(dongTaiDTO.getDtId());

        } catch (IOException e) {
            e.printStackTrace();
        }*/
        /*if(files.length>0){

            for (MultipartFile file : files) {
                String url = request.getRealPath("/static/upload");
                String path = url+"/"+file.getOriginalFilename();
                try {
                    file.transferTo(new File(path));
                    dongtaiPic.setDtId(dongTaiDTO.getDtId());
                    dongtaiPic.setDpicUrl(path);
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }*/




    /**
     * 点赞喜欢动态
     */
    @RequestMapping("/world/likeDongtai")
    public Map<String,Object> like(Integer likeState, Integer dtId,Integer uId){
        Map<String,Object> map = new HashMap();
        int k =  dongtaiService.updateLikeDongtai(likeState,dtId,uId);
        if(k>0){
            map.put("code",0);
            map.put("msg","success");
        }else {
            map.put("code",1);
            map.put("msg","default");
        }
        return map;
    }
    /**
     * 举报
     */
    @RequestMapping("/world/jubao")
    public Map<String,Object> jubao(Integer dtId,Integer uId){
        Map<String,Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","success");
        return map;
    }
    /**
     * 世界（社区）动态
     */
    @RequestMapping("/world/getDongtai")
    public Map<String,Object> getPic(){

        Map map = dongtaiService.getAll();
        if(map!=null){
            map.put("code",0);
            map.put("msg","success");
        }else {
            map.put("code",1);
            map.put("msg","default");
        }

        return map;
    }
    /**
     * 动态详情
     */
    @RequestMapping("/world/dongtaiInfo")
    public Map<String,Object> dongtaiInfo(Integer dtId){
        Map map = dongtaiService.getDongtai(1);
        if(map!=null){
            map.put("code",0);
            map.put("msg","success");
        }else {
            map.put("code",1);
            map.put("msg","default");
        }
        return map;
    }


}
