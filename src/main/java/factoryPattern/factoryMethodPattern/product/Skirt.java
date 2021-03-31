package factoryPattern.factoryMethodPattern.product;

/**
 * 裙子产品类
 * @ClassName:Skirt
 * @DESCRIPTION:
 * @author: cxc
 * @DATE: 2021/3/25
 */

public class Skirt implements Product {

    @Override
    public void show() {
        System.out.println("我是一间漂亮的裙子");
    }

    public Skirt() {
        System.out.println("制造了一件新的裙子");
    }
}
