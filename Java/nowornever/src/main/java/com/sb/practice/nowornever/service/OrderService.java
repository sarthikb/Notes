package com.sb.practice.nowornever.service;

import com.sb.practice.nowornever.models.Order;
import com.sb.practice.nowornever.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }

    public List<Order> getOrdersByUserId(Long userId) {
//        return orderRepository.findAll().stream()
//                .filter(order -> order.getUser().getId().equals(userId))
//                .toList();
        return orderRepository.findOrdersByUserId(userId);
    }
}
