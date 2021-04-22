package strategyPattern;

/**
 * 加法策略，实现加法的具体功能
 *
 * @PROJECT_NAME: DesignPattern
 * @ClassName: AddStrategy
 * @DESCRIPTION:
 * @author: cxc
 * @date: 2021/4/22
 */

public class AddStrategy implements Strategy {

    @Override
    public int operation(int numOne, int numTwo) {
        return numOne + numTwo;

    }
}
