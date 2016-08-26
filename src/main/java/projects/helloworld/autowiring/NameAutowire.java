package projects.helloworld.autowiring;

/**
 * Created by Ekeocha on 8/22/2016.
 */
public class NameAutowire extends Autowire {

    final String TYPE = "By Name";

    public void setArtifact(Artifact artifact){
        this.artifact = artifact;
    }

    public void printAutowireType() {
        System.out.println(artifact.getMessage() + " " + TYPE);
    }
}
