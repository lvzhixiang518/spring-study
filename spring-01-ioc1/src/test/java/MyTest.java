import com.lzx.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {

        //获取applicationcontext
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        //容器在手，天下我有
        UserServiceImpl userServiceImpl =(UserServiceImpl) context.getBean("UserServiceImpl");
        userServiceImpl.getUser();

    }
}