package factoryPattern.FactoryMethodPattern;

import factoryPattern.factoryMethodPattern.factory.SkirtFactory;
import factoryPattern.factoryMethodPattern.factory.SweaterFactory;
import factoryPattern.factoryMethodPattern.product.Product;
import org.junit.Test;

public class FactoryMethodTest {
/*
工厂方法模式将简单工厂的逻辑判断交由客户端来执行，由客户端来决定要实例化那个类
 */
    @Test
    public void SkirtTest(){
        //决定实例化裙子的工厂
        SkirtFactory skirtFactory = new SkirtFactory();
        Product product = skirtFactory.createProduct();
        product.show();
    }

    @Test
    public void SweaterTest(){
        //决定实例化毛衣工厂
        SweaterFactory sweaterFactory = new SweaterFactory();
        Product product = sweaterFactory.createProduct();
        product.show();
    }
}