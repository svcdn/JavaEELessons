package com.dnsoft.JavaEEChapter10.dao;
import com.dnsoft.JavaEEChapter10.pojo.Customer;
import org.mybatis.spring.support.SqlSessionDaoSupport;

public class CustomerDaoImpl extends SqlSessionDaoSupport implements CustomerDao {
	// 通过id查询客户
	public Customer findCustomerById(Integer id) {
         	return this.getSqlSession().selectOne("com.dnsoft.JavaEEChapter10.pojo"
				      + ".CustomerMapper.findCustomerById", id);
	}
}
