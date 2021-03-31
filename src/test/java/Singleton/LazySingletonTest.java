package Singleton;

import singletonPattern.lazy.DoubleCheckLazySingleton;
import singletonPattern.lazy.LazySingleton;
import singletonPattern.lazy.SynLazySingleton;
import org.junit.Test;

/**
 * @ClassName:LazySingletonTest
 * @DESCRIPTION:
 * @author: cxc
 * @DATE: 2021/3/17
 */

public class LazySingletonTest {

    /**
    * 
    * @Description: lazySingleton,多线程的环境下不安全
    * @returns:void
    * @author: cxc
    * @date: 2021/3/17
    */
    @Test
    public void lazySingletonTest(){
        new Thread(()->{
            LazySingleton instance = LazySingleton.getInstance();
            System.out.println(instance);
        }).start();

        new Thread(()->{
            LazySingleton instance = LazySingleton.getInstance();
            System.out.println(instance);
        }).start();
    }


    /**
    *
    * @Description: 开放方法加锁实现线程安全，性能并非最优解
    * @returns:void
    * @author: cxc
    * @date: 2021/3/17
    */
    @Test
    public void synLazySingletonTest(){
        long l = System.currentTimeMillis();
        new Thread(()->{
            SynLazySingleton instance = SynLazySingleton.getInstanceSyn();
            System.out.println(instance);
        }).start();

        new Thread(()->{
            SynLazySingleton instance = SynLazySingleton.getInstanceSyn();
            System.out.println(instance);
        }).start();
        long l1 = System.currentTimeMillis();
        System.out.println("用时"+ (l1-l)+"ms");
    }


    /**
     *
     * @Description: 线程安全的懒加载，双重校验锁，多个线程的情况下性能更好
     * @returns:void
     * @author: cxc
     * @date: 2021/3/17
     */
    @Test
    public void doubleCheckLazySingletonTest(){
        long l = System.currentTimeMillis();
        new Thread(()->{
            DoubleCheckLazySingleton instance = DoubleCheckLazySingleton.getInstanceDoubleCheck();
            System.out.println(instance);
        }).start();

        new Thread(()->{
            DoubleCheckLazySingleton instance = DoubleCheckLazySingleton.getInstanceDoubleCheck();
            System.out.println(instance);
        }).start();
        long l1 = System.currentTimeMillis();
        System.out.println("用时"+ (l1-l)+"ms");
    }



}
