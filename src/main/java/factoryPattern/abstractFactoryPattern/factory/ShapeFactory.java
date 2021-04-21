package factoryPattern.abstractFactoryPattern.factory;

import factoryPattern.abstractFactoryPattern.productA.Circle;
import factoryPattern.abstractFactoryPattern.productA.Rectangle;
import factoryPattern.abstractFactoryPattern.productA.Shape;
import factoryPattern.abstractFactoryPattern.productA.Square;
import factoryPattern.abstractFactoryPattern.productB.Color;


/**
 * 形状工厂
 *
 * @ClassName: ShapeFactory
 * @DESCRIPTION:
 * @author: cxc
 * @date: 2021/3/25
 */

public class ShapeFactory implements AbstractFactory {

    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        switch (shape) {
            case "Circle":
                return new Circle();
            case "Rectangle":
                return new Rectangle();
            case "Square":
                return new Square();
            default:
                return null;
        }

    }
}
