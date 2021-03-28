package FactoryPattern.FactoryMethodPattern;

import FactoryPattern.factoryMethodPattern.factory.SkirtFactory;
import FactoryPattern.factoryMethodPattern.factory.SweaterFactory;
import FactoryPattern.factoryMethodPattern.product.Product;
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