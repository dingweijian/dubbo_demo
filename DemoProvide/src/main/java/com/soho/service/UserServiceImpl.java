package com.soho.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.soho.domain.User;

@Service
public class UserServiceImpl implements UserService{
	
	ArrayList<User> userList ;
	
	public UserServiceImpl(){
		userList = new ArrayList();
		userList.add(new User("zhangzhe","900614"));
		userList.add(new User("tutu","890624"));
	}

	public User getOneOneUserInfo(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isAuthed(User user) {
		for(int i=0;i<userList.size();i++){
			if(userList.get(i).getName().equals(user.getName())&&userList.get(i).getPassword().equals(user.getPassword())){
				return true;
			}
		}
		return false;
	}

}
