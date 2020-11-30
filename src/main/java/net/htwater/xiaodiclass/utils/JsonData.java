package net.htwater.xiaodiclass.utils;

import org.json.JSONObject;

public class JsonData {

    //状态码 0表示成功 1表示处理中 -1表示失败
    private Integer code;

    //业务数据
    private Object data;

    //信息
    private String message;

    public JsonData() {
    }

    public JsonData(Integer code, Object data, String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }

    //成功 不用返回数据
    public static JsonData buildSuccess(){
        return new JsonData(0,null,null);
    }

    //成功
    public static JsonData buildSuccess(Object data){
        return new JsonData(0,data,null);
    }

    //失败
    public static JsonData buildError(String message){
        return new JsonData(-1,null,message);
    }


    //失败
    public static JsonData buildError(Integer code,String message){
        return new JsonData(code,null,message);
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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
