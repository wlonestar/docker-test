package com.wjl.project.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author: wjl
 * @date: 2021/9/29 10:27
 * @version: v1.0
 */
@Getter
@Setter
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "username")
    private String username;

    @Column(name = "pasword")
    private String password;

    @Column(name = "age")
    private Integer age;

    @Column(name = "gendar")
    private Boolean gendar;

    @Column(name = "address")
    private String address;

}
