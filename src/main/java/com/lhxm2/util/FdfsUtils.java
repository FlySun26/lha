package com.lhxm2.util;

import org.csource.common.MyException;
import org.csource.fastdfs.*;

import java.io.IOException;

public class FdfsUtils {
    /**
     * 上传文件到fdfs-1
     * @param ip
     * @param localFilename
     * @param fileExtName
     * @return the image's url
     * @throws IOException
     * @throws MyException
     */
    public static String upload(String ip ,String localFilename,String fileExtName) throws IOException, MyException {
        ClientGlobal.init("client.conf");
        //创建监听的客户端对象
        TrackerClient trackerClient = new TrackerClient();
        //得到监听的服务端对象
        TrackerServer trackerServer = trackerClient.getConnection();
        //定义一个存储的服务器对象
        StorageServer storageServer = null;
        //获得存储的客户端对象
        StorageClient storageClient = new StorageClient(trackerServer, storageServer);
        //使用存储的客户端对象上传具体的图片
        String[] jpgs = storageClient.upload_file(localFilename,fileExtName,null);
        String url = "http://"+ip+":85/"+jpgs[0]+"/"+jpgs[1];
        return url;
    }

    /**
     * 上传文件到fdfs-2 默认ip为"39.96.74.48"
     * @param localFilename
     * @param fileExtName
     * @return the image's url
     * @throws IOException
     * @throws MyException
     */
    public static String upload(String localFilename,String fileExtName) throws IOException, MyException {
        return upload("39.96.74.48",localFilename,fileExtName);

    }

    /**
     * 上传文件到fdfs-3 默认ip为"39.96.74.48" 默认文件类型为jpg
     * @param localFilename
     * @return the image's url
     * @throws IOException
     * @throws MyException
     */
    public static String upload(String localFilename) throws IOException, MyException {
        return upload("39.96.74.48",localFilename,"jpg");
    }

    /**
     * 测试
     * @param args
     */
    public static void main(String[] args) {
        try {
            String upload = upload("D:/609637799.jpg");
            System.out.println(upload);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (MyException e) {
            e.printStackTrace();
        }
    }

}
