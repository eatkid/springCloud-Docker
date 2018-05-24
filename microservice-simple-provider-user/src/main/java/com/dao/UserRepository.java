package com.dao;

import com.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * @author eatKid
 */
public interface UserRepository extends JpaRepository<User,Long> {
}
