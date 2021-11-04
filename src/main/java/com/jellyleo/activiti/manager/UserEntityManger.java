package com.jellyleo.activiti.manager;

import com.jellyleo.activiti.model.entity.User;

import java.util.List;

/**
 * 用户实体操作类
 *
 * @date 2021-11-04
 * @since 1.0.0
 */
public abstract class UserEntityManger {

    public abstract User findUserIdId(final String userId);

    public abstract List<User> findGroupByUser(final String userId);

}
