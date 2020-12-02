package net.htwater.xiaodiclass.service;

import net.htwater.xiaodiclass.model.entity.User;

import java.util.Map;

public interface UserService {
    User findByPhone(String phone);

    int save(Map<String,String> userInfo);

    String findByPhoneAndPwd(String phone, String pwd);
}
