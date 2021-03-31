package factoryPattern.abstractFactoryPattern.productA;

/**
 * 形状产品中的正方形
 * @ClassName:Square
 * @DESCRIPTION:
 * @author: cxc
 * @DATE: 2021/3/25
 */

public class Square implements Shape{

    @Override
    public void draw() {
        System.out.println("正方形");
    }
}
