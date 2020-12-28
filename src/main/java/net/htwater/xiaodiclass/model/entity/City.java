package net.htwater.xiaodiclass.model.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


/**
 * Name: 
 * Des:  
 *
 * Author: Shen Haiyun  no.HT151 杞欢閮ㄧЩ鍔ㄧ粍
 * Date:   Sun Dec 27 18:01:46 CST 2020.
 */
@ApiModel(description = "城市")
public class City {

    private long id;
    @ApiModelProperty(value = "全名")
    private String fullName;
    @ApiModelProperty(value = "名称")
    private String name;
    private String shortName;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    @Override
    public String toString() {
        return "City {" +
                ",id = " + id +
                ",fullName = " + fullName +
                ",name = " + name +
                ",shortName = " + shortName +
               "}";
    }
}
