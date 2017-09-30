package builder.burger;

import builder.Item;
import builder.pack.Packing;
import builder.pack.Wrapper;

/**
 * Created by Administrator on 2017/9/30.
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
