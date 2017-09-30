package builder;

import builder.pack.Packing;

/**
 * 食物条目和食物包装的接口
 *
 * Created by Administrator on 2017/9/30.
 */
public interface Item {

    public String name();
    public Packing packing();
    public float price();
}

