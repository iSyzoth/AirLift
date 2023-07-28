package com.savya.airlift.service;

import java.util.List;

import com.savya.airlift.dto.UserDTO;

public interface UserService {
    boolean addUser(UserDTO userDTO);
    List<UserDTO> getAllUsers();
    UserDTO getUserById(int userId);
    void deleteUser(int userId);
    void updateUser(UserDTO userDTO);
}
