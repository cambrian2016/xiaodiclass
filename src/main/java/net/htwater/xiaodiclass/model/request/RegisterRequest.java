package net.htwater.xiaodiclass.model.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "注册")
public class RegisterRequest {

    @ApiModelProperty("用户名")
    private String name;

    @ApiModelProperty("手机号")
    private String phone;

    @ApiModelProperty("密码")
    private String pwd;

    @Override
    public String toString() {
        return "RegisterRequest{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
