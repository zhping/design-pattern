package builder.colddrink;

/**
 * Created by Administrator on 2017/9/30.
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "pepsi";
    }

    @Override
    public float price() {
        return 3.0f;
    }
}
