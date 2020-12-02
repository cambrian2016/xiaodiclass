package net.htwater.xiaodiclass.mapper;

import net.htwater.xiaodiclass.model.entity.Episode;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface EpisodeMapper {
    @Select("SELECT * FROM episode WHERE chapter_id=#{chapterId}")
    List<Episode> findDetailById(int chapterId);
}
