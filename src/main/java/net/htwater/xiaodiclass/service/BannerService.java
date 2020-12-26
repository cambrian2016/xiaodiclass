package net.htwater.xiaodiclass.service;

import net.htwater.xiaodiclass.mapper.BannerMapper;
import net.htwater.xiaodiclass.model.entity.Banner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BannerService {

    @Autowired
    private BannerMapper bannerMapper;

    public List<Banner> getAllBanner() {
        return bannerMapper.getAllBanner();
    }

    public int updateById(Banner banner){
        return bannerMapper.updateById(banner);
    }
}
