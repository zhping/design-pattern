package singleton;

/**双检锁/双重检验锁，
 * （DCL ，即 double-checked locking）
 *
 * Created by Administrator on 2017/9/30.
 */
public class Singleton4 {
    private static volatile Singleton4 instance;

    private Singleton4(){}

    public static Singleton4 getInstance(){
        if (instance==null){
            synchronized (Singleton4.class){
                if (instance==null){
                    return new Singleton4();
                }
            }
        }

        return instance;
    }
}
