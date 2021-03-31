package factoryPattern.factoryMethodPattern.product;

/**
 * 毛衣产品类
 * @ClassName:Sweater
 * @DESCRIPTION:
 * @author: cxc
 * @DATE: 2021/3/25
 */

public class Sweater implements Product {

    @Override
    public void show() {
        System.out.println("我是一件漂亮的毛衣");
    }

    public Sweater() {
        System.out.println("创建了一件新的毛衣");
    }
}
