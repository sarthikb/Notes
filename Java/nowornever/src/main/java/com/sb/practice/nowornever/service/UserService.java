package com.sb.practice.nowornever.service;

import com.sb.practice.nowornever.models.Users;
import com.sb.practice.nowornever.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Users saveUser(Users users) {
        return userRepository.save(users);
    }

    public Users getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public List<Users> getAllUsers() {
        return userRepository.findAll();
    }
}
