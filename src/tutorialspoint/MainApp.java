package tutorialspoint;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by sredxny on 28-01-2017.
 */
public class MainApp {
    public static void main(String[] args){
        ConfigurableApplicationContext context =
                new ClassPathXmlApplicationContext("Beans.xml");

        // Let us raise a start event.
        context.start();

        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");

        obj.getMessage();

        // Let us raise a stop event.
        context.stop();
    }
}
