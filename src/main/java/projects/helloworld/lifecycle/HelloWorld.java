package projects.helloworld.lifecycle;

/**
 * Created by Ekeocha on 8/22/2016.
 */
public class HelloWorld {
    private String message;

    public void getMessage() {
        System.out.println(message);
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private void init(){
        System.out.println("HelloWorld initialization procedure");
    }

    private void destroy(){
        System.out.println("HelloWorld destruction procedure");
    }
}
