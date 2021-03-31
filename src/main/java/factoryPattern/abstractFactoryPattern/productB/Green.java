package factoryPattern.abstractFactoryPattern.productB;

/**
 * 绿色颜料的实现
 * @ClassName:Green
 * @DESCRIPTION:
 * @author: cxc
 * @DATE: 2021/3/25
 */

public class Green implements Color {

    @Override
    public void fill() {
        System.out.println("绿色");
    }
}
