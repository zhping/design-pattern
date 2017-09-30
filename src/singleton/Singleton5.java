package singleton;

/**
 * 登记式/内部静态类
 * Created by Administrator on 2017/9/30.
 */
public class Singleton5 {
    private static class SingletonHolder{
        private static final Singleton5 INSTANCE = new Singleton5();
    }

    private Singleton5(){}

    public static final Singleton5 getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
