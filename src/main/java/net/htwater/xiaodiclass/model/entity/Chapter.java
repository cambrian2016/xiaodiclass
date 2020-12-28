package net.htwater.xiaodiclass.model.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import java.util.List;

@ApiModel(description = "章节")
public class Chapter {

    @ApiModelProperty(value = "序号")
    private Long id;
    @ApiModelProperty(value = "视频id")
    private Long videoId;
    @ApiModelProperty(value = "章节名称")
    private String title;
    @ApiModelProperty(value = "章节顺序")
    private Long ordered;
    @ApiModelProperty(value = "创建时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;
    @ApiModelProperty(value = "集列表")
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
