package com.dnsoft.JavaEEChapter17.controller;

import com.dnsoft.JavaEEChapter17.pojo.Customer;
import com.dnsoft.JavaEEChapter17.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerController {

    @Autowired
    private CustomerService customerService;
    /**
     * 根据id查询客户详情
     */
    @RequestMapping("/findCustomerById")
    public String findCustomerById(Integer id,Model model) {
        Customer customer = customerService.findCustomerById(id);
        model.addAttribute("customer", customer);
        //返回客户信息展示页面
        return "customer";
    }
}
