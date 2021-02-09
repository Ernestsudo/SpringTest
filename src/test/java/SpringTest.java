import com.cuit.MyAspect;
import com.cuit.User;
import com.cuit.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.applet.AppletContext;
import java.util.Date;

public class SpringTest {
    @Test
    public void SpringTest() {
       /*
        String config = "spring-config.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        */
        ClassPathXmlApplicationContext cpxac = new ClassPathXmlApplicationContext("Spring-config.xml");
        User user = cpxac.getBean(User.class, "user");
       // user.Test();
        System.out.println("-----------------------");
     //  user.SayHello();
        System.out.println("-----------------------");

       User user1 = new User(2, "蒲朝禹", "123456");
         user1 = cpxac.getBean(User.class);
     UserService userService = cpxac.getBean(UserService.class);
        userService.addUser(user1);
        System.out.println("------------------------");
        userService.deleteUser(user1);
        cpxac.close();


    }
    //获取不存在的创建类对象
    @Test
    public void Test(){
        String config = "spring-config.xml";
        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(config);
       Date mydate = (Date) classPathXmlApplicationContext.getBean("mydate");
       System.out.println("mydate: "  + mydate);
    }
}
