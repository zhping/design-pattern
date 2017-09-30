package singleton;

/**
 * 懒汉式，线程不安全
 * Created by Administrator on 2017/9/30.
 */
public class Singleton1 {

    private static Singleton1 instance;
    private Singleton1(){}

    public static Singleton1 getInstance(){
        if (instance==null){
            return new Singleton1();
        }
        return instance;
    }
}
