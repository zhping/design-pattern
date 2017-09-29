package abstractfactory;

import factory.Shape;

/**
 * Created by Administrator on 2017/9/29.
 */
public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        Shape square = shapeFactory.getShape("SQUARE");

        Color red = colorFactory.getColor("RED");

        square.draw();
        red.fill();


    }

}
