package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@TableName("user")
@Data
@Entity
@Table(name = "user",schema = "public")
public class User implements Serializable {
    /**
     * 序列版本号
     */
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String username;
    private String password;
    private String nickName;
    private Integer age;
    private String sex;
    private String address;
}
