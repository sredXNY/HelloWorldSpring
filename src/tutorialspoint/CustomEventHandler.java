package tutorialspoint;

import org.springframework.context.ApplicationListener;

/**
 * Created by sredxny on 29-01-2017.
 */
public class CustomEventHandler implements ApplicationListener<CustomEvent> {
    public void onApplicationEvent(CustomEvent event) {
        System.out.println(event.toString());
    }
}
