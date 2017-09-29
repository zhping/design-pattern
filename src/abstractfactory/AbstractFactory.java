package abstractfactory;

import factory.Shape;

/**
 * Created by Administrator on 2017/9/29.
 */
public abstract class AbstractFactory {
    public abstract Shape getShape(String shape);
    public abstract Color getColor(String color);
}
