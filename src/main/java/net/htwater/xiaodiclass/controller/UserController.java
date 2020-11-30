package net.htwater.xiaodiclass.controller;

import net.htwater.xiaodiclass.domain.User;
import net.htwater.xiaodiclass.service.UserService;
import net.htwater.xiaodiclass.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("api/v1/pri/user")
public class UserController {

    @Autowired
    private UserService userService;

//    @PostMapping("register")
//    public JsonData register(@RequestBody Map<String,String> userInfo){
//    }

    @PostMapping("register")
    public JsonData register(@RequestBody Map<String,String> userInfo) {
        int count = userService.save(userInfo);
        if (count == 1) {
            return JsonData.buildSuccess("注册成功");
        } else {
            return JsonData.buildError("注册失败,请重试");
        }
    }
}
