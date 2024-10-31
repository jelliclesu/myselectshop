package com.portfolio.myselectshop.repository;

import com.portfolio.myselectshop.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
