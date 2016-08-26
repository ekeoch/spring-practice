package projects.helloworld.autowiring;

/**
 * Created by Ekeocha on 8/22/2016.
 */
public class ConstructorAutowire extends Autowire {
    String string;

    public ConstructorAutowire(Artifact artifact, String string) {
        this.artifact = artifact;
        this.string = string;
    }

    public void printAutowireType() {
        System.out.println(artifact.getMessage() + " " + string);
    }
}
