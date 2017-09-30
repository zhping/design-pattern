package singleton;

/**
 * 饿汉式
 * Created by Administrator on 2017/9/30.
 */
public class Singleton3 {
    private static Singleton3 instance = new Singleton3();

    private Singleton3(){}

    public static Singleton3 getInstance(){
        return instance;
    }

}
