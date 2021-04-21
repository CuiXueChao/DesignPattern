package builderPattern.exampleTwo;

/**
 * 将要构建的产品类
 *
 * @ClassName: Computer
 * @DESCRIPTION: 模仿电脑的组装
 * @author: cxc
 * @date: 2021/3/28
 */

public class Computer {

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

    //...等等零部件，不一一列举

    /**
     * 静态内部类构建产品
     *
     * @ClassName: Computer
     * @DESCRIPTION: 使用静态内部类的方式实现构建
     * @author: cxc
     * @date: 2021-03-31
     */
    static class Builder {

        private String mainBoard;
        private String box;
        private String memory;


        /*
        类似set方法，赋值后将当前对象返回。
         */
        public Builder buildMainBoard(String mainBoard) {
            this.mainBoard = mainBoard;
            return this;
        }

        public Builder buildBox(String box) {
            this.box = box;
            return this;
        }

        public Builder buildMemory(String memory) {
            this.memory = memory;
            return this;
        }

        public Computer build() {
            return new Computer(mainBoard, box, memory);
        }

    }


    public Computer() {
    }

    public Computer(String mainBoard, String box, String memory) {
        this.mainBoard = mainBoard;
        this.box = box;
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "mainBoard='" + mainBoard + '\'' +
                ", box='" + box + '\'' +
                ", memory='" + memory + '\'' +
                '}';
    }

    public String getMainBoard() {
        return mainBoard;
    }

    public void setMainBoard(String mainBoard) {
        this.mainBoard = mainBoard;
    }

    public String getBox() {
        return box;
    }

    public void setBox(String box) {
        this.box = box;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }
}
