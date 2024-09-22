package com.wangtao.app.consumer.feign.dto;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author wangtao
 * Created at 2024-09-22
 */
@Data
public class UserDTO {

    private Integer id;

    private String username;

    private String password;

    private Integer age;

    private Integer gender;

    private LocalDate birthday;

    private LocalDateTime updateTime;

    private Integer delFlg;

    private LocalDateTime createTime;

}