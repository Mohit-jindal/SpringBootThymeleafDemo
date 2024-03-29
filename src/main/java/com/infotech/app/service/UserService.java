package com.infotech.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.infotech.app.model.User;

@Service
public class UserService 
{
	
	private List<User> userList = new ArrayList<>();
	
	public List<User> getAllUsers()
	{
		return userList;
	}
	
	public void addUser(User user)
	{
		userList.add(user);
	}
}
