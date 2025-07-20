package com.sb.practice.nowornever.repository;

import com.sb.practice.nowornever.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {
    // Additional queries can be defined here if needed
}
