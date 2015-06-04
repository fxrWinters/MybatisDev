package cn.com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.example.dao.UserDao;
import cn.com.example.entity.User;

@Service
public class UserServcie {
	@Autowired
	private UserDao userDao;
	
	public void create(User user) {
		userDao.create(user);
	}
}
