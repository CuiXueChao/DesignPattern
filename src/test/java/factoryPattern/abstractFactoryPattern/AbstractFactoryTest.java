package factoryPattern.abstractFactoryPattern;

import factoryPattern.abstractFactoryPattern.factory.AbstractFactory;
import factoryPattern.abstractFactoryPattern.factory.AllProductFactory;
import factoryPattern.abstractFactoryPattern.productB.Color;
import org.junit.Test;

public class AbstractFactoryTest {

    @Test
    public void AbstractFactoryTest(){
        AbstractFactory colorFactory = AllProductFactory.getFactory("ColorFactory");
        Color color = colorFactory.getColor("Blue");
        color.fill();
    }
}