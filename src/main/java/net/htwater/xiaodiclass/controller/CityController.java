package net.htwater.xiaodiclass.controller;

import net.htwater.xiaodiclass.model.entity.City;
import net.htwater.xiaodiclass.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 城市(City)表控制层
 *
 * @author makejava
 * @since 2020-12-27 06:48:13
 */
@RestController
@RequestMapping("city")
public class CityController {

    @Autowired
    private CityService cityService;


    @GetMapping("selectOne/{id}")
    public City selectOne(@PathVariable Integer id) {
        return this.cityService.queryById(id);
    }

}