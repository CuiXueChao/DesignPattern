package factoryPattern.abstractFactoryPattern.productB;

/**
 * 红色颜料的实现
 * @ClassName:Red
 * @DESCRIPTION:
 * @author: cxc
 * @DATE: 2021/3/25
 */

public class Red implements Color {

    @Override
    public void fill() {
        System.out.println("红色");
    }
}
