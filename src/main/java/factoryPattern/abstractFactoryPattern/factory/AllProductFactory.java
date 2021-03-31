package factoryPattern.abstractFactoryPattern.factory;

/**
 * @ClassName:AllProductFactory
 * @DESCRIPTION:
 * @author: cxc
 * @DATE: 2021/3/25
 */

public class AllProductFactory {

    /*
    扩展相对困难
     */

    public static AbstractFactory getFactory(String factory){

        switch (factory) {
            case "ColorFactory":return new ColorFactory();
            case "ShapeFactory":return new ShapeFactory();
            default:return null;
        }

    }
}
