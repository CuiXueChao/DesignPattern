package FactoryPattern.factoryMethodPattern.factory;

import FactoryPattern.factoryMethodPattern.product.Product;
import FactoryPattern.factoryMethodPattern.product.Skirt;

/**
 * 裙子工厂类
 * @ClassName:SkirtFactory
 * @DESCRIPTION:
 * @author: cxc
 * @DATE: 2021/3/25
 */

public class SkirtFactory implements Factory {

    @Override
    public Product createProduct() {
        return new Skirt();
    }
}
