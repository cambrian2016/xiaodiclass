package net.htwater.xiaodiclass.model.entity;


import java.util.Date;

public class PlayRecord {

  private long id;
  private long userId;
  private long videoId;
  private long currentNum;
  private long episodeId;
  private Date createTime;

  @Override
  public String toString() {
    return "PlayRecord{" +
            "id=" + id +
            ", userId=" + userId +
            ", videoId=" + videoId +
            ", currentNum=" + currentNum +
            ", episodeId=" + episodeId +
            ", createTime=" + createTime +
            '}';
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public long getVideoId() {
    return videoId;
  }

  public void setVideoId(long videoId) {
    this.videoId = videoId;
  }


  public long getCurrentNum() {
    return currentNum;
  }

  public void setCurrentNum(long currentNum) {
    this.currentNum = currentNum;
  }


  public long getEpisodeId() {
    return episodeId;
  }

  public void setEpisodeId(long episodeId) {
    this.episodeId = episodeId;
  }


  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

}
