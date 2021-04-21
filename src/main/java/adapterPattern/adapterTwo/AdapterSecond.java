package adapterPattern.adapterTwo;

/**
 * @ClassName: AdapterSecond
 * @DESCRIPTION:
 * @author: cxc
 * @date: 2021-04-18
 */
public class AdapterSecond {
    public static void main(String[] args) {
        //不符合“最少知道原则”，通过继承暴漏了父类的方法，对所使用的方法造成了“污染”
        Adapter adapter = new Adapter();
        adapter.outPut5V();
    }
}

/**
 * 第二种适配器模式的实现方式
 * <br><br>
 * 220V插座
 *
 * @ClassName: Adapt
 * @DESCRIPTION: 通过继承来获取被适配的方法
 * @author: cxc
 * @date: 2021-04-15
 */
class Adapt {
    public int outPut220V() {
        return 220;
    }
}

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

class Adapter extends Adapt implements Target {

    @Override
    public int outPut5V() {
        //省略复杂的转换过程······
        int i = outPut220V();
        System.out.printf("实现二-----原始电压为： %dV ，现在输出电压为：%d", i, 5);
        return 5;
    }
}