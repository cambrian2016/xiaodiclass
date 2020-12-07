package net.htwater.xiaodiclass.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import net.htwater.xiaodiclass.model.entity.Video;
import net.htwater.xiaodiclass.model.entity.VideoBanner;
import net.htwater.xiaodiclass.service.VideoService;
import net.htwater.xiaodiclass.utils.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags = "videoController", description = "视频api")
@RestController
@RequestMapping("api/v1/pub/video")
public class VideoController {

    @Autowired
    private VideoService videoService;

    //视频列表
    @ApiOperation("视频列表")
    @GetMapping("list")
    public ResultBean<List<Video>> videoList() {
        List<Video> videoList = videoService.videoList();
        try {
            System.out.println("videoList == " + new ObjectMapper().writeValueAsString(videoList));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return ResultBean.buildSuccess(videoList);
    }

    //轮播图列表
    @ApiOperation("轮播图列表")
    @GetMapping("videoBannerList")
    public ResultBean<List<VideoBanner>> videoBannerList() {
        List<VideoBanner> videoBannerList = videoService.videoBannerList();
        return ResultBean.buildSuccess(videoBannerList);
    }

    @ApiOperation("视频信息 通过videoId查找")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "videoId", value = "视频id", required = true, paramType = "query"),
    })
    @GetMapping("findDetailById")
    public ResultBean<Video> findDetailById(int videoId) {
        Video video = videoService.findDetailById(videoId);

        return ResultBean.buildSuccess(video);
    }
}
