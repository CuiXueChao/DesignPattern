package factoryPattern.simpleFactoryPattern.product;

/**
 * @ClassName: Circle
 * @DESCRIPTION: 圆形实现类
 * @author: cxc
 * @date: 2021/3/25
 */

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("画圆形");
    }
}
