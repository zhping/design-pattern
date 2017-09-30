package singleton;

/**
 * 懒汉式，线程安全
 * Created by Administrator on 2017/9/30.
 */
public class Singleton2 {
    private static Singleton2 instance;
    private Singleton2(){}

    public static synchronized Singleton2  getInstance(){
        if (instance==null){
            return new Singleton2();
        }
        return instance;
    }
}
