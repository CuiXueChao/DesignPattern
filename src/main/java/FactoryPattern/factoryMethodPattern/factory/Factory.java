package FactoryPattern.factoryMethodPattern.factory;

import FactoryPattern.factoryMethodPattern.product.Product;

/**
 * 所有工厂的抽象类
 * @ClassName:Factory
 * @DESCRIPTION: 工厂抽象类，在简单工厂的前提下对工厂也进行抽象，具体工厂职责单一化
 * @author: cxc
 * @DATE: 2021/3/25
 */

public interface Factory {

    /**
    * 创建产品的方法
    * @Description:
    * @returns:FactoryPattern.factoryMethod.product.Product
    * @author: cxc
    * @date: 2021/3/25
    */
    Product createProduct();

}
