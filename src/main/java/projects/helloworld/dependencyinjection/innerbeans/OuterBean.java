package projects.helloworld.dependencyinjection.innerbeans;

/**
 * Created by Ekeocha on 8/24/2016.
 */
public class OuterBean {
    private InnerBean innerBean;

    public void setInnerBean(InnerBean innerBean) {
        System.out.println("Inside outer bean.");
        this.innerBean = innerBean;
    }

    public void printInnerBeanAction(){
        innerBean.action();
    }
}
