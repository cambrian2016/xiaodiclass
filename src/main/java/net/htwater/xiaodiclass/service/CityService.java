package net.htwater.xiaodiclass.service;

import net.htwater.xiaodiclass.mapper.CityMapper;
import net.htwater.xiaodiclass.model.entity.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 城市(City)表服务实现类
 *
 * @author makejava
 * @since 2020-12-27 06:48:13
 */
@Service("cityService")
public class CityService {
    @Autowired
    private CityMapper cityMapper;

    //通过ID查询单条数据
    public City queryById(Integer id) {
        return this.cityMapper.queryById(id);
    }

}