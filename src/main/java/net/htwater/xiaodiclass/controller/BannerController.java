package net.htwater.xiaodiclass.controller;

import net.htwater.xiaodiclass.model.entity.Banner;
import net.htwater.xiaodiclass.model.entity.City;
import net.htwater.xiaodiclass.service.BannerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "banner")
public class BannerController {
    @Autowired
    BannerService bannerService;

    @GetMapping("getAll")
    public List<Banner> getAllBanner(){
        return bannerService.getAllBanner();
    }

    @PutMapping("update")
    public int update(@RequestBody Banner banner){
        return bannerService.updateById(banner);
    }

    @GetMapping("getAll2")
    public City getAllBanner2(){
        return new City();
    }

}
