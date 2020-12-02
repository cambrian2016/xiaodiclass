package net.htwater.xiaodiclass.model.entity;


import java.util.Date;

public class VideoOrder {

  private Long id;
  private String outTradeNo;
  private Long state;
  private Date createTime;
  private Long totalFee;
  private Long videoId;
  private String videoTitle;
  private String videoImg;
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
