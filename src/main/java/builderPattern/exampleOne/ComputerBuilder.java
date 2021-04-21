package builderPattern.exampleOne;

/**
 * 构建电脑的抽象
 *
 * @ClassName: ComputerBuilder
 * @DESCRIPTION: 复杂对象需要一定的构建顺序，例如组装电脑要先将主板上的东西弄好最后装到主机，还有不同品牌的电脑都有不同的属性（不同的零件）
 * @author: cxc
 * @date: 2021/3/28
 */

public interface ComputerBuilder {

    /**
     * 主板的构建
     *
     * @param mainBoard 主板
     * @Description:
     * @author: cxc
     * @date: 2021/3/28
     */
    void buildMainBoard(String mainBoard);


    /**
     * 内存的构建
     *
     * @param memory 内存
     * @Description:
     * @author: cxc
     * @date: 2021/3/28
     */
    void buildMemory(String memory);

    /**
     * 机箱的构建
     *
     * @param box 机箱
     * @Description:
     * @author: cxc
     * @date: 2021/3/28
     */
    void buildBox(String box);

    /**
     * 产品构建接口
     *
     * @Description: 不同的构建方式要对此方法进行不同的实现
     * @Return: builderPattern.exampleOne.Computer
     * @author: cxc
     * @date: 2021/3/31
     */
    Computer build();

    //...
}
