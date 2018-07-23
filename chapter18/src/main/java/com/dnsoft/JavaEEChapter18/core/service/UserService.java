package com.dnsoft.JavaEEChapter18.core.service;


import com.dnsoft.JavaEEChapter18.core.pojo.User;

/**
 * 用户Service层接口
 */
public interface UserService {
	// 通过账号和密码查询用户
	public User findUser(String usercode, String password);
}
