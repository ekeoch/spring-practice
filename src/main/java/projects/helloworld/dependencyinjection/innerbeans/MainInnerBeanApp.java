package projects.helloworld.dependencyinjection.innerbeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Ekeocha on 8/24/2016.
 */
public class MainInnerBeanApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("InnerBeanContext.xml");
        OuterBean outerBean = (OuterBean) applicationContext.getBean("outerBean");

        outerBean.printInnerBeanAction();

    }
}
