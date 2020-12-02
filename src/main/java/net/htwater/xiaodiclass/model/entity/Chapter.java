package net.htwater.xiaodiclass.model.entity;


import java.util.Date;
import java.util.List;

public class Chapter {

  private Long id;
  private Long videoId;
  private String title;
  private Long ordered;
  private Date createTime;

  private List<Episode> episodeList;

  @Override
  public String toString() {
    return "Chapter{" +
            "id=" + id +
            ", videoId=" + videoId +
            ", title='" + title + '\'' +
            ", ordered=" + ordered +
            ", createTime=" + createTime +
            ", episodeList=" + episodeList +
            '}';
  }

  public List<Episode> getEpisodeList() {
    return episodeList;
  }

  public void setEpisodeList(List<Episode> episodeList) {
    this.episodeList = episodeList;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }


  public Long getVideoId() {
    return videoId;
  }

  public void setVideoId(Long videoId) {
    this.videoId = videoId;
  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public Long getOrdered() {
    return ordered;
  }

  public void setOrdered(Long ordered) {
    this.ordered = ordered;
  }


  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

}
