package prototypePattern;

import org.junit.Test;

public class TreasurePlusTest {

    @Test
    public void TreasurePlusTest() throws CloneNotSupportedException {
        //定义国宝的身份证和国宝
        TreasureCard treasureCard = new TreasureCard(8769);
        TreasurePlus treasurePlus = new TreasurePlus("贾湖骨笛", "1kg", treasureCard);
        //国宝克隆
        TreasurePlus clone = treasurePlus.clone();
        //打印两个实例的信息，可验证引用对象的hashcode值相等
        System.out.println(treasurePlus);
        System.out.println(clone);
        //修改真正国宝的身份证号，验证复制品是否有改变
        treasurePlus.getTreasureCard().setCardId(111);
        //验证
        System.out.println(treasurePlus);
        System.out.println(clone);



    }
}