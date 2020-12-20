package net.htwater.xiaodiclass.utils;

import io.swagger.annotations.ApiModelProperty;

//@ApiModel(description = "接口返回")
public class ResultBean<T> {

    //状态码 0表示成功 1表示处理中 -1表示失败
    @ApiModelProperty("状态码")
    private Integer code;

    //业务数据
    private T data;

     //返回信息
    @ApiModelProperty("返回信息 用以反馈使用人员")
    private String message;

    //错误信息
    @ApiModelProperty("错误信息 用以反馈开发人员")
    private String errorLog;

    public ResultBean() {
    }

    public ResultBean(Integer code, T data, String message, String errorLog) {
        this.code = code;
        this.data = data;
        this.message = message;
        this.errorLog = errorLog;
    }

    //成功
    public static <T> ResultBean<T> buildSuccess(T data) {
        return new ResultBean<T>(0, data, null, null);
    }

    //成功
    public static <T> ResultBean<T> buildSuccess(String message) {
        return new ResultBean<T>(0, null, message, null);
    }


    //失败
    public static <T> ResultBean<T> buildError(String message) {
        return new ResultBean<T>(-1, null, message, null);
    }

    //失败
    public static <T> ResultBean<T> buildError(String message,String errorLog) {
        return new ResultBean<T>(-1, null, message, errorLog);
    }


    //失败
    public static <T> ResultBean<T> buildError(Integer code, String message) {
        return new ResultBean<T>(code, null, message, null);
    }

    //失败
    public static <T> ResultBean<T> buildError(Integer code, String message,String errorLog) {
        return new ResultBean<T>(code, null, message, errorLog);
    }

    @Override
    public String toString() {
        return "ResultBean{" +
                "code=" + code +
                ", data=" + data +
                ", message='" + message + '\'' +
                ", errorLog='" + errorLog + '\'' +
                '}';
    }

    public String getErrorLog() {
        return errorLog;
    }

    public void setErrorLog(String errorLog) {
        this.errorLog = errorLog;
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
