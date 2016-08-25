package projects.helloworld.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Ekeocha on 8/25/2016.
 */
public class MainCollectionsApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("CollectionContext.xml");
        CountryCollection countryCollection = (CountryCollection) applicationContext.getBean("countryCollection");

        countryCollection.getCountryList();
        countryCollection.getCountrySet();
        countryCollection.getCountryMap();
        countryCollection.getCountryProperties();
    }
}
