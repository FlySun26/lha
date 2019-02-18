package com.lhxm2.service.impl;

import com.lhxm2.dao.TokenMapper;
import com.lhxm2.dto.TokenDTO;
import com.lhxm2.pojo.Token;
import com.lhxm2.service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * //                            _ooOoo_
 * //                           o8888888o
 * //                           88" . "88
 * //                           (| -_- |)
 * //                            O\ = /O
 * //                        ____/`---'\____
 * //                      .   ' \\| |// `.
 * //                       / \\||| : |||// \
 * //                     / _||||| -:- |||||- \
 * //                       | | \\\ - /// | |
 * //                     | \_| ''\---/'' | |
 * //                      \ .-\__ `-` ___/-. /
 * //                   ___`. .' /--.--\ `. . __
 * //                ."" '< `.___\_<|>_/___.' >'"".
 * //               | | : `- \`.;`\ _ /`;.`/ - ` : | |
 * //                 \ \ `-. \_ __\ /__ _/ .-` / /
 * //         ======`-.____`-.___\_____/___.-`____.-'======
 * //                            `=---='
 * //
 * //         .............................................
 * //                  佛祖镇楼                  BUG辟易
 * //          佛曰:
 * //                  写字楼里写字间，写字间里程序员；
 * //                  程序人员写程序，又拿程序换酒钱。
 * //                  酒醒只在网上坐，酒醉还来网下眠；
 * //                  酒醉酒醒日复日，网上网下年复年。
 * //                  但愿老死电脑间，不愿鞠躬老板前；
 * //                  奔驰宝马贵者趣，公交自行程序员。
 * //                  别人笑我忒疯癫，我笑自己命太贱；
 * //                  不见满街漂亮妹，哪个归得程序员？
 *
 * @Author: 蔡伟强
 * @Date: 2019/2/17
 * @Time: 9:44
 */
@Service
public class TokenServiceImpl implements TokenService {

    @Autowired
    private TokenMapper tokenMapper;

    @Override
    public int addToken(TokenDTO tokenDTO) {
        Token token = new Token();
        token.setUid(tokenDTO.getuId());
        token.setExptime(tokenDTO.getExpTime());
        token.setUptime(tokenDTO.getUpTime());
        token.setTotken(tokenDTO.getToken());
        return tokenMapper.insertSelective(token);
    }

    @Override
    public TokenDTO findByToken(String token) {
        Token myToken = tokenMapper.findByToken(token);
        TokenDTO tokenDTO = new TokenDTO();
        if (myToken!=null) {
            tokenDTO.setId(myToken.getId());
            tokenDTO.setuId(myToken.getUid());
            tokenDTO.setToken(myToken.getTotken());
            tokenDTO.setUpTime(myToken.getUptime());
            tokenDTO.setExpTime(myToken.getExptime());
        }
        return tokenDTO;
    }
}
