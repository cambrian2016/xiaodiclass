package net.htwater.xiaodiclass.model.result;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "登录ResultBean")
public class LoginResultBean {
    @ApiModelProperty("登录返回token")
    String token;

    public LoginResultBean(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "LoginResultBean{" +
                "token='" + token + '\'' +
                '}';
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
