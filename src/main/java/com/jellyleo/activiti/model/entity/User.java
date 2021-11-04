package com.jellyleo.activiti.model.entity;

import lombok.Data;

/**
 * 1.0.0
 *
 * @date 2021-11-04
 * @since 1.0.0
 */
@Data
public class User {

    // 用户id
    private String id;

    // 用户昵称
    private String nickname;

    // 用户名
    private String username;

    // 密码
    private String password;

    // 加密盐值
    private String salt;

    // 状态
    private Integer status;
}
