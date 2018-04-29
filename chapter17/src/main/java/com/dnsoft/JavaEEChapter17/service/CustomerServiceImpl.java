package com.dnsoft.JavaEEChapter17.service;

import com.dnsoft.JavaEEChapter17.dao.CustomerDao;
import com.dnsoft.JavaEEChapter17.pojo.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
    //注解注入CustomerDao
    @Autowired
    private CustomerDao customerDao;
    //查询客户
    public Customer findCustomerById(Integer id) {
        return this.customerDao.findCustomerById(id);
    }
}
