import com.lzx.Mapper.UserMapper;
import com.lzx.Mapper.UserMapperImpl;
import com.lzx.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);
        for (User user : userMapper.getUser()) {
            System.out.println(user.toString());
        }
    }

}
