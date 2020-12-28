package net.htwater.xiaodiclass.mapper;

import net.htwater.xiaodiclass.model.entity.City;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * 城市(City)表数据库访问层
 *
 * @author makejava
 * @since 2020-12-27 06:48:14
 */
@Mapper
public interface CityMapper {

    //通过ID查询单条数据
    @Select("SElECT * FROM city WHERE id=#{id}")
    City queryById(Integer id);

}