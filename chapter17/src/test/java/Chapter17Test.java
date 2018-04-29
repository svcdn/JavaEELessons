import com.dnsoft.JavaEEChapter17.dao.CustomerDao;
import com.dnsoft.JavaEEChapter17.pojo.Customer;
import com.dnsoft.JavaEEChapter17.service.CustomerService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Chapter17Test {

    @Test
    public void findCustomerByIdTest(){
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        CustomerService customerDao = applicationContext.getBean(CustomerService.class);
        Customer customer = customerDao.findCustomerById(1);
        System.out.println(customer);
    }
}
