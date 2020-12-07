package net.htwater.xiaodiclass.model.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

@ApiModel(description = "视频订单")
public class VideoOrder {

  @ApiModelProperty(value = "序号")
  private Long id;
  @ApiModelProperty(value = "订单号")
  private String outTradeNo;
  @ApiModelProperty(value = "状态")
  private Long state;
  @ApiModelProperty(value = "创建时间")
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
  private Date createTime;
  @ApiModelProperty(value = "总价")
  private Long totalFee;
  @ApiModelProperty(value = "视频id")
  private Long videoId;
  @ApiModelProperty(value = "视频标题")
  private String videoTitle;
  @ApiModelProperty(value = "视频fengmian")
  private String videoImg;
  @ApiModelProperty(value = "用户id")
  private Long userId;

  @Override
  public String toString() {
    return "VideoOrder{" +
            "id=" + id +
            ", outTradeNo='" + outTradeNo + '\'' +
            ", state=" + state +
            ", createTime=" + createTime +
            ", totalFee=" + totalFee +
            ", videoId=" + videoId +
            ", videoTitle='" + videoTitle + '\'' +
            ", videoImg='" + videoImg + '\'' +
            ", userId=" + userId +
            '}';
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }


  public String getOutTradeNo() {
    return outTradeNo;
  }

  public void setOutTradeNo(String outTradeNo) {
    this.outTradeNo = outTradeNo;
  }


  public Long getState() {
    return state;
  }

  public void setState(Long state) {
    this.state = state;
  }


  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }


  public Long getTotalFee() {
    return totalFee;
  }

  public void setTotalFee(Long totalFee) {
    this.totalFee = totalFee;
  }


  public Long getVideoId() {
    return videoId;
  }

  public void setVideoId(Long videoId) {
    this.videoId = videoId;
  }


  public String getVideoTitle() {
    return videoTitle;
  }

  public void setVideoTitle(String videoTitle) {
    this.videoTitle = videoTitle;
  }


  public String getVideoImg() {
    return videoImg;
  }

  public void setVideoImg(String videoImg) {
    this.videoImg = videoImg;
  }


  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

}
