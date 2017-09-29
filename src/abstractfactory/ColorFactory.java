package abstractfactory;

import factory.Shape;

/**
 * Created by Administrator on 2017/9/29.
 */
public class ColorFactory extends AbstractFactory{

    @Override
    public Shape getShape(String shape) {
        return null;
    }

    @Override
    public Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        } else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        }
        return null;
    }
}
