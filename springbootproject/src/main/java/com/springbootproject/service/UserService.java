package com.springbootproject.service;

import com.springbootproject.model.User;
import com.springbootproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User getUser(String username) {

        return userRepository.findByUsername(username);
    }

    // Get all users
    public List<User> getAllUsers() {
        return userRepository.findAll();  // This will return a list of all users
    }

    public User updateUser(String username, User updatedUser) {
        User existingUser = userRepository.findByUsername(username);
        if (existingUser != null) {
            existingUser.setUsername(updatedUser.getUsername());
            existingUser.setEmail(updatedUser.getEmail());
            existingUser.setSkills(updatedUser.getSkills());
            existingUser.setExperience(updatedUser.getExperience());
            return userRepository.save(existingUser);
        }
        return null;
    }

    public boolean deleteUser(String username) {
        User existingUser = userRepository.findByUsername(username);
        if (existingUser != null) {
            userRepository.delete(existingUser);
            return true;
        }
        return false;
    }
}
