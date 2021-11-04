package com.jellyleo.activiti.manager;

import com.jellyleo.activiti.model.entity.User;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 自定义用户管理类，管理用户方法
 *
 * @date 2021-11-04
 * @since 1.0.0
 */
@Component
public class CustomUserEntityManager extends UserEntityManger {

    // 注入底仓Mapper实现



    @Override
    public User findUserIdId(String userId) {
        User user = new User();
        // TODO --
        ActivitiUserUtils

        return null;
    }

    @Override
    public List<User> findGroupByUser(String userId) {
        return null;
    }
}
