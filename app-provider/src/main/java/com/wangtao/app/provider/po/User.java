package com.wangtao.app.provider.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author wangtao
 * Created at 2024-09-22
 */
@TableName(value ="user")
@Data
public class User implements Serializable {

    @Serial
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO)
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