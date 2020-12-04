package net.htwater.xiaodiclass.model.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import java.util.List;

@ApiModel("视频")
public class Video {

    @ApiModelProperty("序号")
    private Long id;
    @ApiModelProperty("标题")
    private String title;
    @ApiModelProperty("简介")
    private String summary;
    @ApiModelProperty("封面")
    @JsonProperty("cover_img")
    private String coverImg;
    @ApiModelProperty("价格")
    private Long price;
    @ApiModelProperty("创建时间")
    @JsonProperty("create_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;
    @ApiModelProperty("得分")
    private Double point;

    @JsonProperty("chapter_list")
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
