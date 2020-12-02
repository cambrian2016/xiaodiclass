package net.htwater.xiaodiclass.mapper;

import net.htwater.xiaodiclass.model.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("SELECT * FROM user WHERE phone=#{phone}")
    User findByPhone(String phone);

    @Insert("INSERT INTO user(name, pwd, head_img, phone, create_time) VALUES(#{name}, #{pwd}, #{headImg}, #{phone}, #{createTime})")
    int save(User user);

    @Select("SELECT * FROM user WHERE phone=#{phone} AND pwd=#{pwd}")
    User findByPhoneAndPwd(String phone, String pwd);
}
