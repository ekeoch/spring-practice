package projects.helloworld.dependencyinjection;

/**
 * Created by Ekeocha on 8/22/2016.
 */
public class AmbiguousConstructorInjection extends Injection {

    private String string1; //Ambiguous
    private String string2; //Constructor

    public AmbiguousConstructorInjection(Artifact artifact, String string2, String string1) {
        this.artifact = artifact;
        this.string1 = string1;
        this.string2 = string2;
    }

    public void printInjectionType() {
        System.out.println(artifact.getMessage() + " " + string1 + " " + string2);
    }
}
