package net.htwater.xiaodiclass.controller;

import io.swagger.annotations.*;
import net.htwater.xiaodiclass.model.entity.User;
import net.htwater.xiaodiclass.model.request.LoginRequest;
import net.htwater.xiaodiclass.model.request.RegisterRequest;
import net.htwater.xiaodiclass.service.UserService;
import net.htwater.xiaodiclass.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;


@Api(tags="userController",description = "用户api")
@RestController
@RequestMapping("api/v1/pri/user")
public class UserController {

    @Autowired
    private UserService userService;

//    name：参数名
//    value：参数的汉字说明、解释
//    required：参数是否必须传
//    paramType：参数放在哪个地方
//            · header --> 请求参数的获取：@RequestHeader
//            · query --> 请求参数的获取：@RequestParam
//            · path（用于restful接口）--> 请求参数的获取：@PathVariable
//            · body（不常用）
//            · form（不常用）
//    dataType：参数类型，默认String，其它值dataType="Integer"
//    defaultValue：参数的默认值

    @ApiOperation("用户注册")
    @PostMapping("register")
    public JsonData register(@RequestBody RegisterRequest registerRequest) {
        int count = userService.save(registerRequest);
        if (count == 1) {
            return JsonData.buildSuccess("注册成功");
        } else {
            return JsonData.buildError("注册失败,请重试");
        }
    }

    //登录接口
    @ApiOperation("用户登录")
    @PostMapping("login")
    public JsonData login(@RequestBody @ApiParam("用户信息") LoginRequest loginRequest){
        String token=userService.findByPhoneAndPwd(loginRequest.getPhone(),loginRequest.getPwd());

        if (token==null){
             return JsonData.buildError("登录失败,账号密码错误");
        }else {
            return JsonData.buildSuccess(token);
        }
    }

    //根据UserId 查询User信息
    @ApiOperation("用户信息 通过token查找")
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
