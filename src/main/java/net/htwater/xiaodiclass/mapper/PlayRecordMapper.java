package net.htwater.xiaodiclass.mapper;

import net.htwater.xiaodiclass.model.entity.PlayRecord;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PlayRecordMapper {

    @Insert("INSERT INTO play_record(user_id, video_id, current_num, episode_id, create_time)" +
            " VALUES(#{userId}, #{videoId}, #{currentNum}, #{episodeId}, #{createTime})")
    int saveRecord(PlayRecord playRecord);
}
