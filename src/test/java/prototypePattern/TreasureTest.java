package prototypePattern;

import org.junit.Test;

import static org.junit.Assert.*;

public class TreasureTest {

    /**
     * 普通原型模式测试
     * @Param
     * @Description: 浅拷贝
     * @returns:void
     * @author: cxc
     * @date: 2021/4/1
    */
    @Test
    public void treasureTest() throws CloneNotSupportedException {
        //唯一的国宝
        Treasure treasure = new Treasure("妇好鸮尊", "10kg");
        //通过clone将国宝的复制品创建出来
        Treasure clone = treasure.clone();
        clone.setTreasureSize("5kg");
        //可通过hashcode来判断两个实例是否相等
        System.out.println(treasure);
        System.out.println(clone);
        System.out.println(treasure.equals(clone));
    }
}