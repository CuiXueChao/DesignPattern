package builderPattern.exampleOne;

/**
 * 具体的构建类，在构建产品的方法中控制具体的构建顺序
 * @ClassName:Director
 * @DESCRIPTION: 
 * @author: cxc
 * @DATE: 2021/3/31
 */

public class Director {

    private ComputerBuilder computerBuilder;

    public Director(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    /** 
     * 构建默认产品的具体方法，在此控制产品构建的顺序
     * @param mainBoard 主板
     * @param memory 内存
     * @param box 机箱
     * @Description:
     * @returns:builderPattern.exampleOne.Computer
     * @author: cxc
     * @date: 2021/3/31
    */
    public Computer makeDefaultComputer(String mainBoard,String memory,String box){
        computerBuilder.buildMainBoard(mainBoard);
        computerBuilder.buildMemory(memory);
        computerBuilder.buildBox(box);
        Computer build = computerBuilder.build();
        return build;
    }

    //其他对应产品的构建方法...
}
