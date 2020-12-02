package net.htwater.xiaodiclass.model.entity;


import java.util.Date;
import java.util.List;

public class Video {

  private Long id;
  private String title;
  private String summary;
  private String coverImg;
  private Long price;
  private Date createTime;
  private Double point;

  private List<Chapter> chapterList;

  @Override
  public String toString() {
    return "Video{" +
            "id=" + id +
            ", title='" + title + '\'' +
            ", summary='" + summary + '\'' +
            ", coverImg='" + coverImg + '\'' +
            ", price=" + price +
            ", createTime=" + createTime +
            ", point=" + point +
            ", chapterList=" + chapterList +
            '}';
  }

  public List<Chapter> getChapterList() {
    return chapterList;
  }

  public void setChapterList(List<Chapter> chapterList) {
    this.chapterList = chapterList;
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


  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }


  public String getCoverImg() {
    return coverImg;
  }

  public void setCoverImg(String coverImg) {
    this.coverImg = coverImg;
  }


  public Long getPrice() {
    return price;
  }

  public void setPrice(Long price) {
    this.price = price;
  }


  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }


  public Double getPoint() {
    return point;
  }

  public void setPoint(Double point) {
    this.point = point;
  }

}
