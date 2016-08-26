package projects.helloworld.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Ekeocha on 8/25/2016.
 */
public class MainAutowireApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("AutowireContext.xml");

        ConstructorAutowire constructorAutowire = (ConstructorAutowire) applicationContext.getBean("constructorAutowire");
        NameAutowire nameAutowire = (NameAutowire) applicationContext.getBean("nameAutowire");
        TypeAutowire typeAutowire = (TypeAutowire) applicationContext.getBean("typeAutowire");

        constructorAutowire.printAutowireType();
        nameAutowire.printAutowireType();
        typeAutowire.printAutowireType();
    }
}
