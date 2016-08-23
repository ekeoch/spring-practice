package projects.helloworld.dependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Ekeocha on 8/22/2016.
 */
public class MainDependencyInjectionApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("DependencyInjection.xml");
        ConstructorInjection constructorInjection = (ConstructorInjection) applicationContext.getBean("constructorInjection");
        AmbiguousConstructorInjection ambiguousConstructorInjection = (AmbiguousConstructorInjection) applicationContext.getBean("ambiguousConstructorInjection");
        SetterInjection setterInjection = (SetterInjection) applicationContext.getBean("setterInjection");

        setterInjection.printInjectionType();
        constructorInjection.printInjectionType();
        ambiguousConstructorInjection.printInjectionType();

    }
}
