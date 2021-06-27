import com.lzx.Config.LzxConfig;
import com.lzx.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Mytest {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(LzxConfig.class);
        User getUser = context.getBean("getUser", User.class);
        System.out.println(getUser.getName());

    }

}
