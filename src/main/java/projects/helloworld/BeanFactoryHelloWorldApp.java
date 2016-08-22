package projects.helloworld;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by Ekeocha on 8/20/2016.
 */
public class BeanFactoryHelloWorldApp {
    public static void main(String[] args) {
        XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("HelloWorldContext.xml"));
        HelloWorld helloWorld = (HelloWorld) xmlBeanFactory.getBean("helloWorld");
        helloWorld.getMessage();
    }
}
