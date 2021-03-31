package factoryPattern.abstractFactoryPattern.factory;

import factoryPattern.abstractFactoryPattern.productA.Shape;
import factoryPattern.abstractFactoryPattern.productB.Color;


/**
 * 抽象工厂
 * @PROJECT_NAME: DesignPattern
 * @DESCRIPTION: 将产品抽象，也将工厂抽象，具体的工厂内部采用简单工厂的分支语句块
 * @author: ASUS
 * @DATE: 2021/3/25
 */

public interface AbstractFactory {

  /** 
   * 获取颜料工厂
   * @param color 具体的颜料参数
   * @Description:
   * @returns:FactoryPattern.abstractFactoryPattern.productB.Color
   * @author: cxc
   * @date: 2021/3/25
  */
    Color getColor(String color);

    /**
    * 获取形状工厂
    * @param shape 具体的形状参数
    * @Description:
    * @returns:FactoryPattern.simpleFactoryPattern.product.Shape
    * @author: cxc
    * @date: 2021/3/25
    */
    Shape getShape(String shape);
}
