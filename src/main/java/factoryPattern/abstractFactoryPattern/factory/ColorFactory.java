package factoryPattern.abstractFactoryPattern.factory;

import factoryPattern.abstractFactoryPattern.productA.Shape;
import factoryPattern.abstractFactoryPattern.productB.Blue;
import factoryPattern.abstractFactoryPattern.productB.Color;
import factoryPattern.abstractFactoryPattern.productB.Green;
import factoryPattern.abstractFactoryPattern.productB.Red;

/**
 * 颜料工厂
 *
 * @ClassName: ColorFactory
 * @DESCRIPTION:
 * @author: cxc
 * @date: 2021/3/25
 */
/*
和简单工厂非常相似
 */

public class ColorFactory implements AbstractFactory {

    @Override
    public Color getColor(String color) {
        switch (color) {
            case "Blue":
                return new Blue();
            case "Green":
                return new Green();
            case "Red":
                return new Red();
            default:
                return null;
        }
    }

    @Override
    public Shape getShape(String shape) {
        //颜料工厂不参与形状的实现，单一职责
        return null;
    }
}
