package abstractfactory;

import factory.ShapeFactory;

/**
 * Created by Administrator on 2017/9/29.
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
       if (choice.equalsIgnoreCase("SHAPE")){
           return new ShapeFactory();
       }else if(choice.equalsIgnoreCase("COLOR")){
           return new ColorFactory();
       }

        return null;
    }
}
