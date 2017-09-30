package builder.burger;

/**
 * Created by Administrator on 2017/9/30.
 */
public class ChichenBurger extends Burger {
    @Override
    public String name() {
        return "chichenburger";
    }

    @Override
    public float price() {
        return 15.0f;
    }
}
