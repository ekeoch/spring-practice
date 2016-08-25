package projects.helloworld.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * Created by Ekeocha on 8/25/2016.
 */
public class CountryCollection {
    private List countryList;
    private Set countrySet;
    private Map countryMap;
    private Properties countryProperties;

    public void getCountryList() {
        System.out.println("List Elements: " + countryList);
    }

    public void setCountryList(List countryList) {
        this.countryList = countryList;
    }

    public void getCountrySet() {
        System.out.println("Set Elements: " + countrySet);
    }

    public void setCountrySet(Set countrySet) {
        this.countrySet = countrySet;
    }

    public void getCountryMap() {
        System.out.println("Map Elements: " + countryMap);
    }

    public void setCountryMap(Map countryMap) {
        this.countryMap = countryMap;
    }

    public void getCountryProperties() {
        System.out.println("Property ELements: " + countryProperties);
    }

    public void setCountryProperties(Properties countryProperties) {
        this.countryProperties = countryProperties;
    }
}
