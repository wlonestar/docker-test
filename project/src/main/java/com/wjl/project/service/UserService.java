package com.wjl.project.service;

import com.wjl.project.entity.User;
import com.wjl.project.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: wjl
 * @date: 2021/9/29 10:34
 * @version: v1.0
 */
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

}
