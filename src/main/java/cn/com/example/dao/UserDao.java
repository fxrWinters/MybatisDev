package cn.com.example.dao;

import org.apache.ibatis.annotations.Select;

import cn.com.example.entity.User;

public interface UserDao extends MybatisDAO {
	void create(User user);
	
	@Select("select * from whoo_user where user_id = #{userId}")
	User select(int userId);
}
