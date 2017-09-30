package builder.burger;

/**
 * Created by Administrator on 2017/9/30.
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "vegburger";
    }


    @Override
    public float price() {
        return 6.0f;
    }
}
