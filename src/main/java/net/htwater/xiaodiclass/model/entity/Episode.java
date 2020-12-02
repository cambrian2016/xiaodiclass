package net.htwater.xiaodiclass.model.entity;


import java.util.Date;

public class Episode {

  private Long id;
  private String title;
  private Long num;
  private Long ordered;
  private String playUrl;
  private Long chapterId;
  private Long free;
  private Long videoId;
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
