package com.dnsoft.JavaEEChapter10.dao;

import com.dnsoft.JavaEEChapter10.pojo.Customer;

public interface CustomerDao {
	// 通过id查询客户
	public Customer findCustomerById(Integer id);
}
