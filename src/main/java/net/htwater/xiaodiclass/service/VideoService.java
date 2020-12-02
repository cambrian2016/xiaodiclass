package net.htwater.xiaodiclass.service;

import net.htwater.xiaodiclass.model.entity.Video;
import net.htwater.xiaodiclass.model.entity.VideoBanner;

import java.util.List;

public interface VideoService {
    List<Video> videoList();

    List<VideoBanner> videoBannerList();

    Video findDetailById(int videoId);
}
