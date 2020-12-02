package net.htwater.xiaodiclass.model.entity;


import java.util.Date;

public class VideoBanner {

  private Long id;
  private String url;
  private String img;
  private Date createTime;
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
