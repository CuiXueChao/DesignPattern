package adapterPattern.adapterOne;

/**
 * 将一个类的接口转换成客户希望的另外一个接口。适配器模式使得原本由于接口不兼容而不能一起工作的那些类可以一起工作。<br>
 * 采用手机充电器转换电压的例子，描述适配器模式
 *
 * @ClassName: AdapterFirst
 * @DESCRIPTION:
 * @author: cxc
 * @date: 2021/4/14
 */

public class AdapterFirst {
    public static void main(String[] args) {
        //现在只有220V的电压输出
        Adapt adaptee = new Adapt();
        //现在有一个适配器（变压器）可以将220V的电压转换为5V电压供手机充电。
        Adapter adapter = new Adapter(adaptee);
        //转换电压
        adapter.outPut5V();
    }
}

/**
 * 需要被适配的对象，可能由于特殊原因不能够被直接使用，故需要一个适配器来进行转换，之后再提供给用户使用。
 * <br><br>
 * 220V插座
 *
 * @ClassName: Adapt
 * @DESCRIPTION: 输出220V电压
 * @author: cxc
 * @date: 2021-04-14
 */
class Adapt {
    public int outPut220V() {
        return 220;
    }
}

/**
 * 转换接口，220V---》5V
 *
 * @ClassName: Target
 * @DESCRIPTION:
 * @author: cxc
 * @date: 2021-04-14
 */
interface Target {
    /**
     * 电压转换
     *
     * @return int
     * @author cxc
     * @date: 2021/4/14
     */
    int outPut5V();
}

/**
 * 适配器，通过适配器区适配需要被适配的对象并提供给用户可以使用的方法
 * <br><br>
 * 手机充电器
 *
 * @ClassName: Adapter
 * @DESCRIPTION:
 * @author: cxc
 * @date: 2021-04-14
 */
class Adapter implements Target {

    /**
     * 定义被适配的对象
     */
    private Adapt adaptee;

    public Adapter(Adapt adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public int outPut5V() {
        //省略复杂的转换过程······
        int i = adaptee.outPut220V();
        System.out.printf("实现一-----原始电压为： %dV ，现在输出电压为：%d", i, 5);
        return 5;
    }
}