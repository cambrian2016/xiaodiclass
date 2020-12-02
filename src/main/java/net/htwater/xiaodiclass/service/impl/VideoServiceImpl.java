package net.htwater.xiaodiclass.service.impl;

import net.htwater.xiaodiclass.model.entity.Video;
import net.htwater.xiaodiclass.model.entity.VideoBanner;
import net.htwater.xiaodiclass.mapper.VideoMapper;
import net.htwater.xiaodiclass.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoServiceImpl implements VideoService {

    @Autowired
    private VideoMapper videoMapper;

    @Override
    public List<Video> videoList() {
        return videoMapper.videoList();
    }

    @Override
    public List<VideoBanner> videoBannerList() {
        return videoMapper.videoBannerList();
    }

    @Override
    public Video findDetailById(int videoId) {
        return videoMapper.findDetailById(videoId);
    }
}
