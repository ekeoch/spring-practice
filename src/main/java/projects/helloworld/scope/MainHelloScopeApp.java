package projects.helloworld.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Ekeocha on 8/20/2016.
 */
public class MainHelloScopeApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("HelloScopeContext.xml");
        HelloScope helloScope = (HelloScope) applicationContext.getBean("helloScope");
        helloScope.getScope(); //default singleton

        HelloScope helloScopePrototype = (HelloScope) applicationContext.getBean("helloScope");
        helloScopePrototype.setScope("prototype");
        helloScopePrototype.getScope(); //prototype

    }
}
