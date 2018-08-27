package com.dnsoft.JavaEEChapter18.test;

import com.dnsoft.JavaEEChapter18.core.dao.BaseDictDao;
import com.dnsoft.JavaEEChapter18.core.dao.UserDao;
import com.dnsoft.JavaEEChapter18.core.pojo.BaseDict;
import com.dnsoft.JavaEEChapter18.core.pojo.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={
        "classpath:applicationContext.xml"
})
public class DaoTest {

    // 客户来源
    @Value("${customer.from.type}")
    private String FROM_TYPE;
    // 客户所属行业
    @Value("${customer.industry.type}")
    private String INDUSTRY_TYPE;
    // 客户级别
    @Value("${customer.level.type}")
    private String LEVEL_TYPE;

    // 注入UserDao
    @Autowired
    private UserDao userDao;

    // 注入BaseDictDao
    @Autowired
    private BaseDictDao baseDictDao;

    @Test
    public void userDaoTest(){
        //测试查找用户
        User user = this.userDao.findUser("admin", "123456");
        Assert.assertEquals("UserDao.finduser","1",user.getUser_id().toString());

        //测试查找类别
        List<BaseDict> baseDictList = this.baseDictDao.selectBaseDictByTypeCode(FROM_TYPE);
        Assert.assertEquals(2,baseDictList.size());
    }
}
