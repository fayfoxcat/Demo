package org.cat.springbootmybatis.service;

import jakarta.annotation.Nullable;
import org.cat.springbootmybatis.domain.entity.User;

import java.util.List;

public interface UserService {

    /**
     * 获取所有用户列表
     *
     * @return 用户列表
     */
    List<User> list();

    /**
     * 根据条件查询用户列表
     * @param name 用户名
     * @return 用户列表
     */
    List<User> list(@Nullable String name);
}
