package projects.helloworld;

/**
 * Created by Ekeocha on 8/19/2016.
 */
public class HelloWorld {
    private String message;
    private int count;

    public void setMessage(String message) {
        this.message = message;
    }

    public void getMessage() {
        System.out.println("Your Message: " + message + " " + ++count);
    }
}
