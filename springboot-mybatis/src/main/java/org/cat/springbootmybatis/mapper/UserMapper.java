package org.cat.springbootmybatis.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.cat.springbootmybatis.domain.entity.User;

import java.util.List;

/**
 * @author cat
 */
@Mapper
public interface UserMapper {

    /**
     * 获取所有用户列表
     *
     * @return 用户列表
     */
    @Select("select * from user")
    List<User> list();

    /**
     * 根据条件查询用户列表
     *
     * @param name 用户名
     * @return 用户列表
     */
    List<User> list(@Param("name") String name);
}
