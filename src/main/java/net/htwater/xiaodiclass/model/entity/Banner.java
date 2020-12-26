package net.htwater.xiaodiclass.model.entity;


import java.util.Date;
import java.util.List;

public class Banner {

  private long id;
  private String name;
  private String description;
  private Date createTime;
  private Date updateTime;
  private Date deleteTime;
  private String title;
  private String img;

  private List<BannerItem> bannerItemList;

  public List<BannerItem> getBannerItemList() {
    return bannerItemList;
  }

  public void setBannerItemList(List<BannerItem> bannerItemList) {
    this.bannerItemList = bannerItemList;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }

  public Date getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(Date updateTime) {
    this.updateTime = updateTime;
  }

  public Date getDeleteTime() {
    return deleteTime;
  }

  public void setDeleteTime(Date deleteTime) {
    this.deleteTime = deleteTime;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getImg() {
    return img;
  }

  public void setImg(String img) {
    this.img = img;
  }
}
