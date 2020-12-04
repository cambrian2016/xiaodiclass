package net.htwater.xiaodiclass.service;

import net.htwater.xiaodiclass.model.entity.User;
import net.htwater.xiaodiclass.model.request.RegisterRequest;

import java.util.Map;

public interface UserService {
    User findByPhone(String phone);

    int save(RegisterRequest registerRequest);

    String findByPhoneAndPwd(String phone, String pwd);

    User findByUserId(String userId);
}
