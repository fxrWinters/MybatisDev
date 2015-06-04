package cn.com.example.dao;

import cn.com.example.entity.User;

public interface UserDao extends MybatisDAO {
	void create(User user);
}
