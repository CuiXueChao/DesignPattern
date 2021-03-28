package FactoryPattern.simpleFactoryPattern.product;

/**
 * @ClassName:Square
 * @DESCRIPTION: 正方形实现类
 * @author: cxc
 * @DATE: 2021/3/25
 */

public class Square implements Shape{

    @Override
    public void draw() {
        System.out.println("画正方形");
    }
}
