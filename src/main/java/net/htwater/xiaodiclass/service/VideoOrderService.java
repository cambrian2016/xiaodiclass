package net.htwater.xiaodiclass.service;

import net.htwater.xiaodiclass.model.entity.VideoOrder;

import java.util.List;

public interface VideoOrderService {

    int save(int userId,int videoId);

    List<VideoOrder> videoOrderList(int userId);
}
