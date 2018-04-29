package com.dnsoft.JavaEEChapter17.dao;

import com.dnsoft.JavaEEChapter17.pojo.Customer;

/**
 * Customer接口文件
 */
public interface CustomerDao {
    /**
     * 根据id查询客户信息
     */
    public Customer findCustomerById(Integer id);
}
