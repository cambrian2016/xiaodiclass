package net.htwater.xiaodiclass.model.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

@ApiModel(description = "集")
public class Episode {
  @ApiModelProperty(value = "序号")
  private Long id;
  @ApiModelProperty(value = "集标题")
  private String title;
  @ApiModelProperty(value = "第几集,全局顺序")
  private Long num;
  @ApiModelProperty(value = "顺序，章节里面的顺序")
  private Long ordered;
  @ApiModelProperty(value = "播放地址")
  private String playUrl;
  @ApiModelProperty(value = "章节id")
  private Long chapterId;
  @ApiModelProperty(value = "0表示免费,1表示收费")
  private Long free;
  @ApiModelProperty(value = "视频id")
  private Long videoId;
  @ApiModelProperty(value = "创建时间")
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
  private Date createTime;

  @Override
  public String toString() {
    return "Episode{" +
            "id=" + id +
            ", title='" + title + '\'' +
            ", num=" + num +
            ", ordered=" + ordered +
            ", playUrl='" + playUrl + '\'' +
            ", chapterId=" + chapterId +
            ", free=" + free +
            ", videoId=" + videoId +
            ", createTime=" + createTime +
            '}';
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public Long getNum() {
    return num;
  }

  public void setNum(Long num) {
    this.num = num;
  }


  public Long getOrdered() {
    return ordered;
  }

  public void setOrdered(Long ordered) {
    this.ordered = ordered;
  }


  public String getPlayUrl() {
    return playUrl;
  }

  public void setPlayUrl(String playUrl) {
    this.playUrl = playUrl;
  }


  public Long getChapterId() {
    return chapterId;
  }

  public void setChapterId(Long chapterId) {
    this.chapterId = chapterId;
  }


  public Long getFree() {
    return free;
  }

  public void setFree(Long free) {
    this.free = free;
  }


  public Long getVideoId() {
    return videoId;
  }

  public void setVideoId(Long videoId) {
    this.videoId = videoId;
  }


  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

}
