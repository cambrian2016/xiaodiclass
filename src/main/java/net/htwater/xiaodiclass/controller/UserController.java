package net.htwater.xiaodiclass.controller;

import net.htwater.xiaodiclass.model.entity.User;
import net.htwater.xiaodiclass.model.request.LoginRequest;
import net.htwater.xiaodiclass.service.UserService;
import net.htwater.xiaodiclass.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
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

    //登录接口
    @PostMapping("login")
    public JsonData login(@RequestBody LoginRequest loginRequest){
        String token=userService.findByPhoneAndPwd(loginRequest.getPhone(),loginRequest.getPwd());

        if (token==null){
             return JsonData.buildError("登录失败,账号密码错误");
        }else {
            return JsonData.buildSuccess(token);
        }
    }

    //根据UserId 查询User信息
    @GetMapping("findUserInfoByToken")
    public JsonData findUserInfoByToken(HttpServletRequest httpServletRequest){
        String userId= (String) httpServletRequest.getAttribute("userId");

        if (userId==null){
            return JsonData.buildError("查询失败");
        }else {
            User user=userService.findByUserId(userId);
            return JsonData.buildSuccess(user);
        }
    }
}
