package tutorialspoint;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Created by sredxny on 28-01-2017.
 */
public class HelloWorld implements InitializingBean, DisposableBean{
    private String message;

    public void setMessage(String message){
        this.message=message;
    }

    public void getMessage(){
        System.out.println(this.message);
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
