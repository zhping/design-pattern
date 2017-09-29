package abstractfactory;

/**
 * Created by Administrator on 2017/9/29.
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Red: fill() method");
    }
}
