package projects.helloworld.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Ekeocha on 8/22/2016.
 */
public class MainLifeCycleApp {
    public static void main(String[] args) {
        AbstractApplicationContext abstractApplicationContext = new ClassPathXmlApplicationContext("LifeCycleContext.xml");
        HelloWorld helloWorld = (HelloWorld) abstractApplicationContext.getBean("helloWorld");
        helloWorld.getMessage();
        abstractApplicationContext.registerShutdownHook();
    }
}
