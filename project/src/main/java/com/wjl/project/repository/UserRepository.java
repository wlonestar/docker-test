package com.wjl.project.repository;

import com.wjl.project.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author: wjl
 * @date: 2021/9/29 10:33
 * @version: v1.0
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
