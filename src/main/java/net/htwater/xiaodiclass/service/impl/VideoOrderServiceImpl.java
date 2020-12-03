package net.htwater.xiaodiclass.service.impl;

import net.htwater.xiaodiclass.exception.CustomException;
import net.htwater.xiaodiclass.mapper.*;
import net.htwater.xiaodiclass.model.entity.Episode;
import net.htwater.xiaodiclass.model.entity.PlayRecord;
import net.htwater.xiaodiclass.model.entity.Video;
import net.htwater.xiaodiclass.model.entity.VideoOrder;
import net.htwater.xiaodiclass.service.VideoOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class VideoOrderServiceImpl implements VideoOrderService {

    @Autowired
    private VideoOrderMapper videoOrderMapper;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private VideoMapper videoMapper;

    @Autowired
    private EpisodeMapper episodeMapper;

    @Autowired
    private PlayRecordMapper playRecordMapper;

    @Transactional
    @Override
    public int save(int userId, int videoId) {

        VideoOrder videoOrder = videoOrderMapper.findByUserIdAndVideoIdAndState(userId, videoId, 1);
        if (videoOrder != null) {
            return 0;
        }

        Video video = videoMapper.findById(videoId);

        VideoOrder videoOrderTemp = new VideoOrder();
        videoOrderTemp.setOutTradeNo(UUID.randomUUID().toString());
        videoOrderTemp.setState(1L);
        videoOrderTemp.setCreateTime(new Date());
        videoOrderTemp.setTotalFee(video.getPrice());
        videoOrderTemp.setVideoId(video.getId());
        videoOrderTemp.setVideoTitle(video.getTitle());
        videoOrderTemp.setVideoImg(video.getCoverImg());
        videoOrderTemp.setUserId((long) userId);

        int count = videoOrderMapper.saveOrder(videoOrderTemp);

//        int i=1/0;

        if (count == 1) {
            Episode episode = episodeMapper.findFirstEpisodeByVideoId(videoId);

            if (episode==null){
                throw new CustomException(-1,"视频没有集信息,请联系运营人员检查");
            }

            PlayRecord playRecord = new PlayRecord();
            playRecord.setUserId(userId);
            playRecord.setVideoId(videoId);
            playRecord.setCurrentNum(episode.getNum());
            playRecord.setEpisodeId(episode.getId());
            playRecord.setCreateTime(new Date());

            int num = playRecordMapper.saveRecord(playRecord);
        }

        return count;
    }

    @Override
    public List<VideoOrder> videoOrderList(int userId) {
        List<VideoOrder> videoOrderList= videoOrderMapper.videoOrderListByUserId(userId);
        return videoOrderList;
    }
}
