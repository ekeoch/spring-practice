package projects.helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Ekeocha on 8/19/2016.
 */
public class MainHelloWorldApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("HelloWorldContext.xml");
        HelloWorld helloWorld = (HelloWorld) applicationContext.getBean("helloWorld");
        helloWorld.getMessage();

        HelloWorld helloWorldScope = (HelloWorld) applicationContext.getBean("helloWorld");
        helloWorldScope.setMessage("Testing Scope");
        helloWorldScope.getMessage();


    }
}
