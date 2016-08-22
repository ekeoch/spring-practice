package projects.helloworld.scope;

/**
 * Created by Ekeocha on 8/20/2016.
 */
public class HelloScope {
    private String scope;
    private int count;

    public void getScope() {
        System.out.println("Your scope is: " + scope + " " + ++count);
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

}
