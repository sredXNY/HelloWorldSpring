package tutorialspoint;

import org.springframework.context.ApplicationEvent;

/**
 * Created by sredxny on 29-01-2017.
 */
public class CustomEvent extends ApplicationEvent {
    public CustomEvent(Object source) {
        super(source);
    }

    public String toString(){
        return "My Custom Event";
    }
}
