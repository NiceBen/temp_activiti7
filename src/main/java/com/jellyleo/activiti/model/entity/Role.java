package com.jellyleo.activiti.model.entity;

import lombok.Data;

/**
 * 角色表
 *
 * @date 2021-11-04
 * @since 1.0.0
 */
@Data
public class Role {

    private String id;

    private String role;

    private String description;

    private Integer enable;

    private String permissions;
}
