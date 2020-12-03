package net.htwater.xiaodiclass.service.impl;

import net.htwater.xiaodiclass.mapper.UserMapper;
import net.htwater.xiaodiclass.mapper.VideoMapper;
import net.htwater.xiaodiclass.mapper.VideoOrderMapper;
import net.htwater.xiaodiclass.model.entity.Video;
import net.htwater.xiaodiclass.model.entity.VideoOrder;
import net.htwater.xiaodiclass.service.VideoOrderService;
import net.htwater.xiaodiclass.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;

@Service
public class VideoOrderServiceImpl implements VideoOrderService {

    @Autowired
    private VideoOrderMapper videoOrderMapper;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private VideoMapper videoMapper;

    @Override
    public int save(int userId, int videoId) {

        VideoOrder videoOrder=videoOrderMapper.findByUserIdAndVideoIdAndState(userId,videoId,1);
        if (videoOrder!=null){
            return 0;
        }

        Video video=videoMapper.findById(videoId);

        VideoOrder videoOrderTemp=new VideoOrder();
        videoOrderTemp.setOutTradeNo(UUID.randomUUID().toString());
        videoOrderTemp.setState(1L);
        videoOrderTemp.setCreateTime(new Date());
        videoOrderTemp.setTotalFee(video.getPrice());
        videoOrderTemp.setVideoId(video.getId());
        videoOrderTemp.setVideoTitle(video.getTitle());
        videoOrderTemp.setVideoImg(video.getCoverImg());
        videoOrderTemp.setUserId((long) userId);

        int count=videoOrderMapper.saveOrder(videoOrderTemp);
        return count;
    }
}