package factoryPattern.factoryMethodPattern.factory;

import factoryPattern.factoryMethodPattern.product.Product;
import factoryPattern.factoryMethodPattern.product.Sweater;

/**
 * 毛衣工厂类
 * @ClassName:SweaterFactory
 * @DESCRIPTION:
 * @author: cxc
 * @DATE: 2021/3/25
 */

public class SweaterFactory implements Factory {

    @Override
    public Product createProduct() {
        return new Sweater();
    }
}
