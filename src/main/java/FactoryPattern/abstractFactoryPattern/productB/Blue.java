package FactoryPattern.abstractFactoryPattern.productB;

/**
 * 蓝色颜料的实现
 * @ClassName:Blue
 * @DESCRIPTION:
 * @author: cxc
 * @DATE: 2021/3/25
 */

public class Blue implements Color {

    @Override
    public void fill() {
        System.out.println("蓝色");
    }
}
