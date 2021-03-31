package Singleton;

import singletonPattern.EnumSingleton;
import org.junit.Test;

/**
 * @ClassName:EnumSingletonTest
 * @DESCRIPTION:
 * @author: cxc
 * @DATE: 2021/3/17
 */

public class EnumSingletonTest {
    @Test
    public void Test(){
        EnumSingleton instance1 =EnumSingleton.INSTANCE;
        EnumSingleton instance2 = EnumSingleton.INSTANCE;
        System.out.println(instance1==instance2);
    }

    @Test
    public void aTest(){
        System.out.println(EnumSingleton.INSTANCE.toString());
    }
}
