package strategyPattern;

/**
 * 要实现策略的对象
 *
 * @PROJECT_NAME: DesignPattern
 * @ClassName: Execute
 * @DESCRIPTION:
 * @author: cxc
 * @date: 2021/4/22
 */

public class Execute {
    private Strategy strategy;
    private int numOne;
    private int numTwo;

    /**
     * 执行运算方法
     *
     * @return int
     * @author cxc
     * @date: 2021/4/22
     */
    public int executeCount() {
        return strategy.operation(this.numOne, this.numTwo);
    }


    public Execute(int numOne, int numTwo) {
        this.numOne = numOne;
        this.numTwo = numTwo;
        this.strategy = new AddStrategy();
    }

    public Execute(int numOne, int numTwo, Strategy strategy) {
        this.strategy = strategy;
        this.numOne = numOne;
        this.numTwo = numTwo;
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int getNumOne() {
        return numOne;
    }

    public void setNumOne(int numOne) {
        this.numOne = numOne;
    }

    public int getNumTwo() {
        return numTwo;
    }

    public void setNumTwo(int numTwo) {
        this.numTwo = numTwo;
    }
}
