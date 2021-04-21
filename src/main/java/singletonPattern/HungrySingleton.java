package singletonPattern;

/**
 * @ClassName: HungryMan
 * @DESCRIPTION: 单例模式，饿汉式,基于jvm的类加载机制实现线程安全
 * @author: cxc
 * @date: 2021/3/15
 */

public class HungrySingleton {

    private static HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {

    }

    public static HungrySingleton getInstance() {
        return instance;
    }
}
