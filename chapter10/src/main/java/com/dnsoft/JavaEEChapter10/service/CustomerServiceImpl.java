package com.dnsoft.JavaEEChapter10.service;

import com.dnsoft.JavaEEChapter10.mapper.CustomerMapper;
import com.dnsoft.JavaEEChapter10.pojo.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
    //注解注入CustomerMapper
    @Autowired
    private CustomerMapper customerMapper;
    //添加客户
    public void addCustomer(Customer customer) {
        this.customerMapper.addCustomer(customer);
        int i=1/0; //模拟添加操作后系统突然出现的异常问题
    }
}
