package com.savya.airlift.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.savya.airlift.dto.UserDTO;
import com.savya.airlift.entity.User;
import com.savya.airlift.repository.UserRepository;
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepository;

	@Override
	public boolean addUser(UserDTO userDTO) {
		User userEntity = new User();
		BeanUtils.copyProperties(userDTO, userEntity);
		userRepository.save(userEntity);		
		return true;
	}

	@Override
	public List<UserDTO> getAllUsers() {
		List<User> userList = userRepository.findAll();
		ArrayList<UserDTO> listDTO = new ArrayList<>();
		for (User objUser : userList) {
			UserDTO dto = new UserDTO();
			BeanUtils.copyProperties(objUser, dto);
			listDTO.add(dto);
		}
		return listDTO;
	}

	@Override
	public UserDTO getUserById(int userId) {
		Optional<User>  optUser= userRepository.findById(userId);
		if (optUser.isPresent()) {
			UserDTO dto = new UserDTO();
			BeanUtils.copyProperties(optUser.get(), dto);
			return dto;
		} else {
			return null;
		}
	}

	@Override
	public void deleteUser(int userId) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateUser(UserDTO userDTO) {
		// TODO Auto-generated method stub

	}

}
