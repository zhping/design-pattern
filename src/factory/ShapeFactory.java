package factory;

/**
 * Created by Administrator on 2017/9/29.
 */
public class ShapeFactory {

    public Shape getShape(String shapeType){
        if (shapeType==null){
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }
        if (shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }
        if (shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }

        return null;
    }

    public Object getClass(Class<?extends Shape> clazz){
        Object obj = null;
        try {
            obj = Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return obj;
    }
}
