package factoryPattern.simpleFactoryPattern.product;

/**
 * @ClassName: Rectangle
 * @DESCRIPTION: 长方形实现类
 * @author: cxc
 * @date: 2021/3/25
 */

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("画长方形");
    }
}
