import com.dnsoft.JavaEEChapter10.dao.CustomerDao;
import com.dnsoft.JavaEEChapter10.mapper.CustomerMapper;
import com.dnsoft.JavaEEChapter10.pojo.Customer;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

    @Test
    public void findCustomerByIdDaoTest(){
        ApplicationContext act =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        // 根据容器中Bean的id来获取指定的Bean
        CustomerDao customerDao =
                (CustomerDao) act.getBean("customerDao");
//	     CustomerDao customerDao = act.getBean(CustomerDao.class);
        Customer customer = customerDao.findCustomerById(1);
        System.out.println(customer);
    }

    @Test
    public void findCustomerByIdMapperTest(){
        ApplicationContext act =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerMapper customerMapper = act.getBean(CustomerMapper.class);
        Customer customer = customerMapper.findCustomerById(2);
        System.out.println(customer);
    }
}
