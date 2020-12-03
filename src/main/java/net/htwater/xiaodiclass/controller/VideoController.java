package net.htwater.xiaodiclass.controller;

import net.htwater.xiaodiclass.model.entity.Video;
import net.htwater.xiaodiclass.model.entity.VideoBanner;
import net.htwater.xiaodiclass.service.VideoService;
import net.htwater.xiaodiclass.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/pub/video")
public class VideoController {

    @Autowired
    private VideoService videoService;

    //视频列表
    @GetMapping("list")
    public JsonData videoList(){
        List<Video> videoList=videoService.videoList();
        return JsonData.buildSuccess(videoList);
    }

    //轮播图列表
    @GetMapping("videoBannerList")
    public JsonData videoBannerList(){
        List<VideoBanner> videoBannerList=videoService.videoBannerList();
        int i=1/0;
        return JsonData.buildSuccess(videoBannerList);
    }

    @GetMapping("findDetailById")
    public JsonData findDetailById(int videoId){
        Video video=videoService.findDetailById(videoId);

        return JsonData.buildSuccess(video);
    }
}
