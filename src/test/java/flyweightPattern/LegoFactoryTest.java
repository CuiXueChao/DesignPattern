package flyweightPattern;

import org.junit.Test;

import java.util.Map;

public class LegoFactoryTest {

    @Test
    public void flyweightTest() {
        //在三个红色的四个单位的积木，验证创建的次数
        Lego redA = LegoFactory.getLego("red", 4);
        Lego redB = LegoFactory.getLego("red", 4);
        Lego redC = LegoFactory.getLego("red", 4);
        //获取同样的积木，共创建一次该类型的积木。

        //再次验证
        Lego greenA = LegoFactory.getLego("green", 5);
        Lego greenB = LegoFactory.getLego("green", 2);

        //遍历map，验证容器中的对象
        LegoFactory.stringLegoHashMap.forEach((x, y) -> {
            System.out.println(x + "---" + y);
        });

        for (Map.Entry map : LegoFactory.stringLegoHashMap.entrySet()) {
            System.out.println(map.getKey() + "=====" + map.getValue());
        }
    }
}