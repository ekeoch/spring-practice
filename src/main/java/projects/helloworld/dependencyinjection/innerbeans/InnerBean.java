package projects.helloworld.dependencyinjection.innerbeans;

/**
 * Created by Ekeocha on 8/24/2016.
 */
public class InnerBean {
    public InnerBean() {
        System.out.println("Inside inner bean constructor.");
    }

    public void action(){
        System.out.println("Inner bean action");
    }
}
