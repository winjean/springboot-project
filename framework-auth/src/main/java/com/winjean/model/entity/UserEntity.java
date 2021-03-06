package com.winjean.model.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.winjean.common.BaseEntity;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;


@Data
@Entity(name = "t_user")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserEntity extends BaseEntity {

//    @Id
//    @GeneratedValue(strategy= GenerationType.AUTO)
//    @Column(name="user_id")
//    private Long id;

    /**
     * 用户名
     */
    @Column(name = "user_name", unique = true)
    private String name;

    /**
     * 密码
     */
    private String password;

    /**
     * 密码加盐
     */
    private String salt;

    /**
     * 出生日期
     */
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date birthday;

    /**
     * 电话
     */
    private String telephone;

    /**
     * 性别
     */
    private String sex;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 是否可用
     */
    private boolean enable = true;

    /**
     * 部门
     */
    @ManyToOne
    @JoinColumn(name = "dept_id")
    @JsonBackReference
    private DeptEntity department;
}
