package projects.helloworld.dependencyinjection;

/**
 * Created by Ekeocha on 8/22/2016.
 */
public class SetterInjection extends Injection {

    final String TYPE = "Setter";

    public void setArtifact(Artifact artifact){
        this.artifact = artifact;
    }

    public void printInjectionType() {
        System.out.println(artifact.getMessage() + " " + TYPE);
    }
}
