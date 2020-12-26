package net.htwater.xiaodiclass.mapper;

import net.htwater.xiaodiclass.model.entity.Banner;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface BannerMapper {


    @Select("SELECT *\n" +
            "FROM banner")
    @Results({
            @Result(property = "id",column = "id"),
            @Result(property = "name",column = "name"),
            @Result(property = "description",column = "description"),
            @Result(property = "createTime",column = "create_time"),
            @Result(property = "updateTime",column = "update_time"),
            @Result(property = "deleteTime",column = "delete_time"),
            @Result(property = "title",column = "title"),
            @Result(property = "img",column = "img"),

            @Result(
                    property = "bannerItemList",
                    column = "id",
                    javaType = List.class,
                    many = @Many(select = "net.htwater.xiaodiclass.mapper.BannerItemMapper.getBannerItemByBannerId")
            ),
    })
    List<Banner> getAllBanner();

    @Update("UPDATE banner\n" +
            "SET banner.name        = #{name},\n" +
            "    banner.description = #{description},\n" +
            "    banner.create_time = #{createTime},\n" +
            "    banner.update_time = #{updateTime},\n" +
            "    banner.delete_time = #{deleteTime},\n" +
            "    banner.title       = #{title},\n" +
            "    banner.img         = #{name}\n" +
            "WHERE banner.id        = #{id}")
    int updateById(Banner banner);
}
