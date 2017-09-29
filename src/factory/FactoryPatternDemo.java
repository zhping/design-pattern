package factory;

/**
 * Created by Administrator on 2017/9/29.
 */
public class FactoryPatternDemo {

    public static void main(String[] args) {

        /*ShapeFactory shapeFactory = new ShapeFactory();

        shapeFactory.getShape("CIRCLE").draw();
        shapeFactory.getShape("RECTANGLE").draw();
        shapeFactory.getShape("SQUARE").draw();*/

        ShapeFactory shapeFactory = new ShapeFactory();
        Circle circle =  (Circle) shapeFactory.getClass(Circle.class);
        Rectangle rectangle = (Rectangle) shapeFactory.getClass(Rectangle.class);
        Square square = (Square) shapeFactory.getClass(Square.class);
        circle.draw();
        rectangle.draw();
        square.draw();

    }
}
