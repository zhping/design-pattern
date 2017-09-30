package singleton;

/**
 * Created by Administrator on 2017/9/30.
 */
public class SingleObject {
    private static  SingleObject instance = new SingleObject();
    private SingleObject(){}
    public static SingleObject getIstance (){
        return instance;
    }
    public void showMessage(){
        System.out.println("Hello World");
    }
}
