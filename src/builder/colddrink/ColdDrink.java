package builder.colddrink;

import builder.Item;
import builder.pack.Bottle;
import builder.pack.Packing;

/**
 * Created by Administrator on 2017/9/30.
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price() ;
}
