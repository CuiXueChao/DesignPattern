package FactoryPattern.abstractFactoryPattern;

import FactoryPattern.abstractFactoryPattern.factory.AbstractFactory;
import FactoryPattern.abstractFactoryPattern.factory.AllProductFactory;
import FactoryPattern.abstractFactoryPattern.productB.Color;
import org.junit.Test;

import static org.junit.Assert.*;

public class AbstractFactoryTest {

    @Test
    public void AbstractFactoryTest(){
        AbstractFactory colorFactory = AllProductFactory.getFactory("ColorFactory");
        Color color = colorFactory.getColor("Blue");
        color.fill();
    }
}