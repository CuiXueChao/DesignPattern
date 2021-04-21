package decoratorPattern;

/**
 * 装饰器模式（Decorator Pattern）允许向一个现有的对象添加新的功能，同时又不改变其结构。这种类型的设计模式属于结构型模式，它是作为现有的类的一个包装。
 * <br>
 * 功能定义为相机的拍照功能--vivo手机，夜拍是王牌--添加超稳微云台功能
 *
 * @ClassName: Function
 * @DESCRIPTION:
 * @author: cxc
 * @date: 2021/4/20
 */

public interface Photograph {

    /**
     * 定义拍照功能接口，具体品牌的手机具体实现
     *
     * @Return: void
     * @author cxc
     * @date: 2021/4/20
     */
    void photograph();
}
