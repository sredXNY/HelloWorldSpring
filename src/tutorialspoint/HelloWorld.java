package tutorialspoint;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by sredxny on 28-01-2017.
 */
public class HelloWorld implements InitializingBean, DisposableBean{
    private String message1;
    private String message2;

    public void setMessage1(String message){
        this.message1  = message;
    }

    public void setMessage2(String message){
        this.message2  = message;
    }

    public void getMessage1(){
        System.out.println("World Message1 : " + message1);
    }

    public void getMessage2(){
        System.out.println("World Message2 : " + message2);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        //some stuff here!
        System.out.println("Creating bean");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroying bean");
    }
}
