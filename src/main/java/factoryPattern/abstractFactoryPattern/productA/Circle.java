package factoryPattern.abstractFactoryPattern.productA;

/**
 * 形状产品的圆形实现
 * @ClassName:Circle
 * @DESCRIPTION:
 * @author: cxc
 * @DATE: 2021/3/25
 */

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("圆形");
    }
}
