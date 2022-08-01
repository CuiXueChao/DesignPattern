package singleton;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import singletonPattern.HungrySingleton;
import singletonPattern.StaticClassSingleton;

/**
 * @ClassName: HungrySingletonTest
 * @DESCRIPTION:
 * @author: cxc
 * @date: 2021/3/17
 */

public class HungrySingletonTest {

    /**
     * @Description: 饿汉模式为线程安全的线程安全的单例模式
     * @author: cxc
     * @date: 2021/3/17
     */
    @Test
    public void hungryTest() {
        HungrySingleton instance1 = HungrySingleton.getInstance();
        HungrySingleton instance2 = HungrySingleton.getInstance();
        System.out.println(instance1 == instance2);
        Assert.assertEquals(instance1, instance1);

    }
    
    @Test
    @DisplayName("静态内部类测试")
    public void staticInterClassTest() {
        StaticClassSingleton instance1 = StaticClassSingleton.getInstance();
        StaticClassSingleton instance2 = StaticClassSingleton.getInstance();
        System.out.println(instance1 == instance2);
    }
}
