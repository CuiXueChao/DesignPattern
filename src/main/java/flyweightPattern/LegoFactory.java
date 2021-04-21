package flyweightPattern;

import java.util.HashMap;

/**
 * 创建乐高的工厂,实现享元模式的核心
 *
 * @ClassName: LegoFactory
 * @DESCRIPTION: 通过一个hashMap来实现缓存，通过判断容器中是否存在该对象，来避免重复的创建对象，来达到复用的目的。
 * @author: cxc
 * @date: 2021/4/2
 */

public class LegoFactory {
    /**
     * 存放乐高的的容器，在此容器中判断是否需要创建乐高对象<br><br>
     * TestCase中需要查验map中的内容，再次声明为public
     */
    public final static HashMap<String, Lego> stringLegoHashMap = new HashMap<String, Lego>();

    /**
     * 获取乐高对象的方法，容器中不存在时，以请求的参数进行乐高对象的创建并返回。
     *
     * @Param: color
     * @Param: data
     * @Description: 容器中存在，直接返回该对象，不存在则进行创建并将乐高放入容器中进行保存
     * @Return: flayweightPattern.Lego
     * @author: cxc
     * @date: 2021/4/2
     */
    
    public static Lego getLego(String color, int data) {
        //key的命名规则
        String key = color + data;
        //判断容器中是否含有该key的对象
        if (stringLegoHashMap.containsKey(key)) {
            //存在则返回
            return stringLegoHashMap.get(key);
        } else {
            //容器中不存在，创建，存放，返回
            Lego lego = new Lego(color, data);
            stringLegoHashMap.put(key, lego);
            return lego;
        }
    }
}