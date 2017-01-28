package tutorialspoint;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by sredxny on 28-01-2017.
 */
public class MainApp {
    public static void main(String[] args){
        ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");

        HelloWorld obj= (HelloWorld) context.getBean("helloWorld");
        obj.getMessage();
    }
}
