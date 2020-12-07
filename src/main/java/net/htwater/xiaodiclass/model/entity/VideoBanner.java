package net.htwater.xiaodiclass.model.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

@ApiModel(description = "视频横幅")
public class VideoBanner {

  @ApiModelProperty(value = "序号")
  private Long id;
  @ApiModelProperty(value = "地址url")
  private String url;
  @ApiModelProperty(value = "图片")
  private String img;
  @ApiModelProperty(value = "创建时间")
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
  private Date createTime;
  @ApiModelProperty(value = "权重")
  private Long weight;

  @Override
  public String toString() {
    return "VideoBanner{" +
            "id=" + id +
            ", url='" + url + '\'' +
            ", img='" + img + '\'' +
            ", createTime=" + createTime +
            ", weight=" + weight +
            '}';
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }


  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public String getImg() {
    return img;
  }

  public void setImg(String img) {
    this.img = img;
  }


  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }


  public Long getWeight() {
    return weight;
  }

  public void setWeight(Long weight) {
    this.weight = weight;
  }

}
