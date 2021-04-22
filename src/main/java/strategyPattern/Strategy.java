package strategyPattern;

/**
 * <p>
 * 实现加减乘除的策略
 * 策略接口 具体的策略实现皆实现当前接口
 * </p>
 * <p>
 * 定义一系列的算法,把它们一个个封装起来, 并且使它们可相互替换。(相同行为的不同实现方式)
 * 解决在有多种算法相似的情况下，使用 if...else 所带来的复杂和难以维护。
 * 优点： 1、算法可以自由切换。 2、避免使用多重条件判断。 3、扩展性良好。
 * 缺点： 1、策略类会增多。 2、所有策略类都需要对外暴露。
 * </p>
 *
 * @PROJECT_NAME: DesignPattern
 * @ClassName: Strategy
 * @DESCRIPTION:
 * @author: cxc
 * @date: 2021/4/22
 */

public interface Strategy {

    /**
     * 算法的抽象
     *
     * @param numOne 操作数1
     * @param numTwo 操作数2
     * @return int
     * @author cxc
     * @date: 2021/4/22
     */
    int operation(int numOne, int numTwo);
}
