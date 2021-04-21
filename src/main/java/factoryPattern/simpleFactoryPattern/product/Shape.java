package factoryPattern.simpleFactoryPattern.product;

/**
 * @PROJECT_NAME: DesignPattern
 * @DESCRIPTION: 将一个形状抽象出来，不同的实现类有不同的形状实现
 * @author: ASUS
 * @date: 2021/3/25
 */

public interface Shape {

    /**
     * shape：形状 ，draw ：画 ，具体画什么图形将由实现类进行实现
     *
     * @Description: 定义画图方法
     * @Return: void
     * @author: cxc
     * @date: 2021/3/25
     */
    void draw();
}
