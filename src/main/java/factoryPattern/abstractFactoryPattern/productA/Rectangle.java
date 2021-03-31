package factoryPattern.abstractFactoryPattern.productA;

/**
 * 形状产品中的长方形
 * @ClassName:Rectangle
 * @DESCRIPTION:
 * @author: cxc
 * @DATE: 2021/3/25
 */

public class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("长方形");
    }
}
