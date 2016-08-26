package projects.helloworld.autowiring;

/**
 * Created by Ekeocha on 8/22/2016.
 */
public class TypeAutowire extends Autowire {

    final String TYPE = "By Type";

    public void setArtifact(Artifact artifact){
        this.artifact = artifact;
    }

    public void printAutowireType() {
        System.out.println(artifact.getMessage() + " " + TYPE);
    }
}
