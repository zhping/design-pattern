package builder.colddrink;

/**
 * Created by Administrator on 2017/9/30.
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "coke";
    }

    @Override
    public float price() {
        return 3.5f;
    }
}
