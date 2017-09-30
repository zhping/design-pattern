package singleton;

/**
 * Created by Administrator on 2017/9/30.
 */
public class SinglePatternDemo {
    public static void main(String[] args) {
//        SingleObject istance = SingleObject.getIstance();
//        istance.showMessage();

        Singleton6.INSTANCE.showMessage();
        System.out.println(Singleton6.INSTANCE);
        System.out.println(Singleton6.INSTANCE);
    }
}
