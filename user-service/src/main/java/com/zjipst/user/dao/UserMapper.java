package com.zjipst.user.dao;

import com.zjipst.user.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author songhao
 */
@Mapper
public interface UserMapper {

    /** 返回所有的user
     * @return
     */
    @Select("select * from tb_user")
    List<User> list();

    /**根据人员id 获取人员
     * @param id
     * @return
     */
    @Select("select * from tb_user where `id` = #{id}")
    User getUserById(@Param("id") Long id);
}
