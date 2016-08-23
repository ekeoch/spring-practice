package projects.helloworld.dependencyinjection;

/**
 * Created by Ekeocha on 8/22/2016.
 */
public class ConstructorInjection extends Injection {

    final String TYPE = "Constructor";

    public ConstructorInjection(Artifact artifact) {
        this.artifact = artifact;
    }

    public void printInjectionType() {
        System.out.println(artifact.getMessage() + " " + TYPE);
    }
}
