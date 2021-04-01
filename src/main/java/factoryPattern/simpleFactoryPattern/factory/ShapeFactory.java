package factoryPattern.simpleFactoryPattern.factory;

import factoryPattern.simpleFactoryPattern.product.Circle;
import factoryPattern.simpleFactoryPattern.product.Rectangle;
import factoryPattern.simpleFactoryPattern.product.Shape;
import factoryPattern.simpleFactoryPattern.product.Square;

/**
 * 形状工厂:当增加新的产品时，需要对产品接口进行实现，并在工厂中增加相应的实例创建部分
 * 违反了开闭原则，不完全算一种设计模式
 * @ClassName:ShapeFactory
 * @DESCRIPTION: 简单工厂的工厂类中包含了必要的逻辑判断，拥有根据条件动态实例化相关类的优点
 * @author: cxc
 * @DATE: 2021/3/25
 */

public class ShapeFactory {
    /**
    * 获取工厂实例的方法
     * @param shape
    * @Description: 获取实例的方法
    * @returns:FactoryPattern.simpleFactoryPattern.product.Shape
    * @author: cxc
    * @date: 2021/3/25
    */
    public Shape getShape(String shape){
        if (shape == null) {
            return null;
        }
        //根据不同的参数返回对应的对象
        switch (shape) {
            case "Circle":
                return  new Circle();

            case "Square":
                return  new Square();

            case "Rectangle":
                return   new Rectangle();
            //仍需在此处进行相应的修改。
            /*
            新的扩展
             */
            default:return null;
        }
    }

}
