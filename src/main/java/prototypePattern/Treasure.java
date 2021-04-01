package prototypePattern;

/**
 * 原型对象 - 浅拷贝，需实现 Cloneable 接口，并重写clone方法
 * @ClassName:Treasure
 * @DESCRIPTION: 宝藏类，国家的某个国宝是唯一的，但是可利用原型模式创建出一模一样的复制品在各地进行同步的宣传工作-----浅拷贝，当有引用类型的对象时，clone的对象中该引用和原型对象的引用为同一个实例。
 * @author: cxc
 * @DATE: 2021/4/1
 */

public class Treasure implements Cloneable{

    /**
     * 国宝的名字
     */
    private String treasureName;
    /**
     * 国宝的尺寸
     */
    private String treasureSize;

    /** 
     * 重写了Object的clone方法
     * @param:
     * @Description: 方法内进行类型转换，避免外部的转换
     * @returns:prototypePattern.Treasure
     * @author: cxc
     * @date: 2021/4/1
    */
    @Override
    protected Treasure clone() throws CloneNotSupportedException {
        return ((Treasure) super.clone());
    }

    public String getTreasureName() {
        return treasureName;
    }

    public void setTreasureName(String treasureName) {
        this.treasureName = treasureName;
    }

    public String getTreasureSize() {
        return treasureSize;
    }

    public void setTreasureSize(String treasureSize) {
        this.treasureSize = treasureSize;
    }

    public Treasure() {
    }

    public Treasure(String treasureName, String treasureSize) {
        this.treasureName = treasureName;
        this.treasureSize = treasureSize;
    }

    @Override
    public String toString() {
        return this.hashCode()+"------Treasure{" +
                "treasureName='" + treasureName + '\'' +
                ", treasureSize='" + treasureSize + '\'' +
                '}';
    }
}
