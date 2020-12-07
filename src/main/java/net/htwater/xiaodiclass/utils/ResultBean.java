package net.htwater.xiaodiclass.utils;

import io.swagger.annotations.ApiModelProperty;

//@ApiModel(description = "接口返回")
public class ResultBean<T> {

    //状态码 0表示成功 1表示处理中 -1表示失败
    @ApiModelProperty("状态码")
    private Integer code;

    //业务数据
    private T data;

    //信息
    @ApiModelProperty("信息")
    private String message;

    public ResultBean() {
    }

    public ResultBean(Integer code, T data, String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }

    //成功 不用返回数据
    public static <T> ResultBean<T> buildSuccess(){
        return new ResultBean<T>(0,null,null);
    }

    //成功
    public static <T> ResultBean<T> buildSuccess(T data){
        return new ResultBean<T>(0,data,null);
    }

    //成功
    public static <T> ResultBean<T> buildSuccess(String message){
        return new ResultBean<T>(0,null,message);
    }

    //失败
    public static <T> ResultBean<T> buildError(T data, String message){
        return new ResultBean<T>(-1,data,message);
    }

    //失败
    public static <T> ResultBean<T> buildError(String message){
        return new ResultBean<T>(-1,null,message);
    }


    //失败
    public static <T> ResultBean<T> buildError(Integer code, String message){
        return new ResultBean<T>(code,null,message);
    }

    @Override
    public String toString() {
        return "JsonData{" +
                "code=" + code +
                ", data=" + data +
                ", message='" + message + '\'' +
                '}';
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
