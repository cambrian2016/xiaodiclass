package net.htwater.xiaodiclass.service;

import net.htwater.xiaodiclass.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.Map;

public interface UserService {
    User findByPhone(String phone);

    int save(Map<String,String> userInfo);
}
