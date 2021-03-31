package builderPattern.exampleOne;

/**
 * 将要构建的产品类
 *
 * @ClassName:Computer
 * @DESCRIPTION: 模仿电脑的组装
 * @author: cxc
 * @DATE: 2021/3/28
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
