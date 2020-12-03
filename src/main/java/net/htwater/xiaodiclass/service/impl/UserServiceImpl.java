package net.htwater.xiaodiclass.service.impl;

import io.jsonwebtoken.Claims;
import net.htwater.xiaodiclass.model.entity.User;
import net.htwater.xiaodiclass.mapper.UserMapper;
import net.htwater.xiaodiclass.service.UserService;
import net.htwater.xiaodiclass.utils.EncryptUtil;
import net.htwater.xiaodiclass.utils.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Map;
import java.util.Random;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User findByPhone(String phone) {
        return userMapper.findByPhone(phone);
    }

    @Override
    public int save(Map<String, String> userInfo) {
        User user = parseToUser(userInfo);

        if (user != null) {
            return userMapper.save(user);
        } else {
            return -1;
        }
    }

    @Override
    public String findByPhoneAndPwd(String phone, String pwd) {
        User user=userMapper.findByPhoneAndPwd(phone, EncryptUtil.getMD5(pwd));
        if (user==null){
            return null;
        }else {
            String token= JwtUtil.geneJsonWebToken(user);
            System.out.println("token = "+token);

//            try {
//                Thread.sleep(1000*5L);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }

            Claims claims=JwtUtil.checkJwt(token);
            String name = (String) claims.get("name");

            System.out.println("name = "+name);
            return token;
        }

    }

    @Override
    public User findByUserId(String userId) {
        User user=userMapper.findByUserId(userId);
//        user.setPwd("");
        return user;
    }

    private User parseToUser(Map<String, String> userInfo) {
        if (userInfo.containsKey("phone") && userInfo.containsKey("pwd") && userInfo.containsKey("name")) {
            User user = new User();
            user.setName(userInfo.get("name"));
            user.setHeadImg(getRandomImg());
            user.setCreateTime(new Date());
            user.setPhone(userInfo.get("phone"));
            user.setPwd(EncryptUtil.getMD5(userInfo.get("pwd")));
            return user;
        } else {
            return null;
        }
    }

    private String getRandomImg() {
        int size = headImgs.length;
        int index = new Random().nextInt(size);
        return headImgs[index];
    }

    /**
     * 放在CDN上的随机头像
     */
    private static final String[] headImgs = {
            "https://xd-video-pc-img.oss-cn-beijing.aliyuncs.com/xdclass_pro/default/head_img/12.jpeg",
            "https://xd-video-pc-img.oss-cn-beijing.aliyuncs.com/xdclass_pro/default/head_img/11.jpeg",
            "https://xd-video-pc-img.oss-cn-beijing.aliyuncs.com/xdclass_pro/default/head_img/13.jpeg",
            "https://xd-video-pc-img.oss-cn-beijing.aliyuncs.com/xdclass_pro/default/head_img/14.jpeg",
            "https://xd-video-pc-img.oss-cn-beijing.aliyuncs.com/xdclass_pro/default/head_img/15.jpeg"
    };
}
