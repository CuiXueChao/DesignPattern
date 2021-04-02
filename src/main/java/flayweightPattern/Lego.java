package flayweightPattern;

/**
 * 乐高积木
 * @ClassName:Brick
 * @DESCRIPTION: 享元模式的应用，以乐高积木为例子。
 * @author: cxc
 * @DATE: 2021/4/2
 */

public class Lego {

    /**
     * 乐高积木的名称，在构造函数中进行初始化，格式为所有属性相连接
     */
    private final String legoName;

    /**
     * 积木的颜色
     */
    private final String color;

    /**
     * 积木的单位个数（最小单位为一个小方块）
     */
    private final int data;

    public Lego(String color, int data) {
        this.color = color;
        this.data = data;
        this.legoName=color+data;
        System.out.println("创建出"+this.color+"色的，"+this.data+"个单位的积木——"+legoName);
    }

    public String getColor() {
        return color;
    }

    public int getData() {
        return data;
    }


    @Override
    public String toString() {
        return "Lego{" +
                "legoName='" + legoName + '\'' +
                ", color='" + color + '\'' +
                ", data=" + data +
                '}';
    }
}
