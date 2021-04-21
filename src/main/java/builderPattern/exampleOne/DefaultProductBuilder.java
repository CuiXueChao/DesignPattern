package builderPattern.exampleOne;

/**
 * 想要使用构建者模式来构建的一种实现。需提供构建对象的方法以及赋值函数，一边构建对象时，顺序的控制
 *
 * @ClassName: DefaultProductBuilder
 * @DESCRIPTION: 对于对象中某些不可变的变量可在此直接定义
 * @author: cxc
 * @date: 2021/3/31
 */

public class DefaultProductBuilder implements ComputerBuilder {

    /**
     * 主板
     */
    private String mainBoard;

    /**
     * 机箱
     */
    private String box;

    /**
     * 内存
     */
    private String memory;

    @Override
    public void buildMainBoard(String mainBoard) {
        this.mainBoard = mainBoard;
    }

    @Override
    public void buildMemory(String memory) {
        this.memory = memory;
    }

    @Override
    public void buildBox(String box) {
        this.box = box;
    }

    @Override
    public Computer build() {
        return new Computer(mainBoard, memory, box);
    }
}
