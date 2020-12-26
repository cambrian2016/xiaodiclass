package net.htwater.xiaodiclass.mapper;

import net.htwater.xiaodiclass.model.entity.Banner;
import net.htwater.xiaodiclass.model.entity.BannerItem;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BannerItemMapper {

    @Select("SELECT *\n" +
            "FROM banner_item\n" +
            "WHERE banner_id = #{BannerId}")
    List<BannerItem> getBannerItemByBannerId(int BannerId);
}
