package net.htwater.xiaodiclass.mapper;

import net.htwater.xiaodiclass.domain.Chapter;
import net.htwater.xiaodiclass.domain.Video;
import net.htwater.xiaodiclass.domain.VideoBanner;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Mapper
public interface VideoMapper {

    @Select("SELECT * FROM video")
    List<Video> videoList();

    @Select("SELECT * FROM video_banner ORDER BY weight desc")
    List<VideoBanner> videoBannerList();

    @Select("SELECT * FROM video WHERE id=#{videoId}")
    @Results({
            @Result(property = "id",column = "id"),
            @Result(property = "title",column = "title"),
            @Result(property = "summary",column = "Summary"),
            @Result(property = "coverImg",column = "cover_img"),
            @Result(property = "price",column = "price"),
            @Result(property = "createTime",column = "create_time"),
            @Result(property = "point",column = "point"),
            @Result(
                    property = "chapterList",
                    column = "id",
                    javaType = List.class,
                    many = @Many(select = "net.htwater.xiaodiclass.mapper.ChapterMapper.findDetailById")
            ),
    })
    Video findDetailById(int videoId);
}


