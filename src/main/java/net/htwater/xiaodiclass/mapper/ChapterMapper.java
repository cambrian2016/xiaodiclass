package net.htwater.xiaodiclass.mapper;

import net.htwater.xiaodiclass.model.entity.Chapter;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ChapterMapper {
    @Select("SELECT * FROM chapter WHERE video_id=#{videoId}")
    @Results({
            @Result(property = "id",column = "id"),
            @Result(property = "videoId",column = "video_id"),
            @Result(property = "title",column = "title"),
            @Result(property = "ordered",column = "ordered"),
            @Result(property = "createTime",column = "create_time"),

            @Result(
                    property = "episodeList",
                    column = "id",
                    javaType = List.class,
                    many = @Many(select = "net.htwater.xiaodiclass.mapper.EpisodeMapper.findDetailById")
            ),
    })
    List<Chapter> findDetailById(int videoId);
}
