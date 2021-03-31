package factoryPattern.SimpleFactoryPattern;

import factoryPattern.simpleFactoryPattern.factory.ShapeFactory;
import factoryPattern.simpleFactoryPattern.product.Shape;
import org.junit.Test;

public class ShapeFactoryTest {


    /** 
    * 通过工厂创建一个圆形
    * @Description: 圆测试
    * @returns:void
    * @author: cxc
    * @date: 2021/3/25
    */
    @Test
    public void CircleTest(){
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShape("Circle");
        circle.draw();
    }



    /**
     * 通过工厂创建一个长方形形
     * @Description: 长方形测试
     * @returns:void
     * @author: cxc
     * @date: 2021/3/25
     */
    @Test
    public void RectangleTest(){
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape rectangle = shapeFactory.getShape("Rectangle");
        rectangle.draw();
    }



    /**
     * 通过工厂创建一个正方形形
     * @Description: 正方形测试
     * @returns:void
     * @author: cxc
     * @date: 2021/3/25
     */
    @Test
    public void SquareTest(){
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape square = shapeFactory.getShape("Square");
        square.draw();
    }
}