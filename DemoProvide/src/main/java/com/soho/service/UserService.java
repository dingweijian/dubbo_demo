package com.soho.service;

import com.soho.domain.User;

public interface UserService {
	User getOneOneUserInfo(String name);
	boolean isAuthed(User user);
}
