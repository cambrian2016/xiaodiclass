package net.htwater.xiaodiclass.mapper;

import net.htwater.xiaodiclass.model.entity.VideoOrder;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface VideoOrderMapper {

    //查询用户 是否购买过此商品
    @Select("SELECT * FROM video_order WHERE user_id=#{userId} AND video_id=#{videoId} AND state=#{state}")
    VideoOrder findByUserIdAndVideoIdAndState(int userId,int videoId,int state);

    @Insert("INSERT INTO video_order (out_trade_no,state,create_time,total_fee,video_id,video_title,video_img,user_id)" +
            " VALUES (#{outTradeNo},#{state},#{createTime},#{totalFee},#{videoId},#{videoTitle},#{videoImg},#{userId})")
    int saveOrder(VideoOrder videoOrder);
}
