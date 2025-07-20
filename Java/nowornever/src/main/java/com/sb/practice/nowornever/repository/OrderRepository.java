package com.sb.practice.nowornever.repository;

import com.sb.practice.nowornever.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
    // Additional queries can be defined here if needed

    List<Order> findByUsersId(Long userId);

    @Query("SELECT o FROM Order o WHERE o.users.id = :userId")
    List<Order> findOrdersByUserId(@Param("userId") Long userId);

}

