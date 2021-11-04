package com.jellyleo.activiti.model.entity;

import lombok.Data;

/**
 * 用户角色关联表
 *
 * @date 2021-11-04
 * @since 1.0.0
 */
@Data
public class UserRole {

    // 关联表主键
    private Integer id;

    // 用户id
    private String userId;

    // 角色id
    private String roleId;
}
