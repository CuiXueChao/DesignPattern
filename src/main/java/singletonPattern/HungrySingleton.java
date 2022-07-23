package singletonPattern;

/**
 * 饿汉式,基于jvm的类加载机制实现,线程安全
 *
 * @author cxc
 * @date 2022/07/23  16:59
 */

public class HungrySingleton {

    private static HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {

    }

    public static HungrySingleton getInstance() {
        return instance;
    }
}
