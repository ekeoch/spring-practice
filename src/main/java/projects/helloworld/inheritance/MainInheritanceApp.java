package projects.helloworld.inheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Ekeocha on 8/22/2016.
 */
public class MainInheritanceApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("InheritanceContext.xml");
        HelloWorld helloWorld = (HelloWorld) applicationContext.getBean("helloWorld");
        HelloChidi helloChidi = (HelloChidi) applicationContext.getBean("helloChidi");

        helloWorld.getMessage1();

        helloChidi.getMessage1();
        helloChidi.getMessage2();
        helloChidi.getMessage3();
    }
}
