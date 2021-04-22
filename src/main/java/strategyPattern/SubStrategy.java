package strategyPattern;

/**
 * 减法策略实现
 *
 * @PROJECT_NAME: DesignPattern
 * @ClassName: SubStrategy
 * @DESCRIPTION:
 * @author: cxc
 * @date: 2021/4/22
 */

public class SubStrategy implements Strategy {

    @Override
    public int operation(int numOne, int numTwo) {
        return numOne - numTwo;
    }
}
