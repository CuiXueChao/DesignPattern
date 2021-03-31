package factoryPattern.FactoryMethodPattern;

import factoryPattern.factoryMethodPattern.factory.SkirtFactory;
import factoryPattern.factoryMethodPattern.factory.SweaterFactory;
import factoryPattern.factoryMethodPattern.product.Product;
import org.junit.Test;

public class FactoryMethodTest {

    @Test
    public void SkirtTest(){
        SkirtFactory skirtFactory = new SkirtFactory();
        Product product = skirtFactory.createProduct();
        product.show();
    }

    @Test
    public void SweaterTest(){
        SweaterFactory sweaterFactory = new SweaterFactory();
        Product product = sweaterFactory.createProduct();
        product.show();
    }
}