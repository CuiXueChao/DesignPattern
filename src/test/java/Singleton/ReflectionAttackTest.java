package Singleton;

import singletonPattern.*;
import singletonPattern.lazy.DoubleCheckLazySingleton;
import singletonPattern.lazy.LazySingleton;
import org.junit.Test;

import java.lang.reflect.Constructor;

/**
 * @ClassName:ReflectionAttack
 * @DESCRIPTION:
 * @author: cxc
 * @DATE: 2021/3/17
 */

public class ReflectionAttackTest {

    @Test
    public void staticClassSingletonTest() throws Exception{
//反射获取类的构造器
        Constructor<StaticClassSingleton> declaredConstructor = StaticClassSingleton.class.getDeclaredConstructor();

        //设置true为禁止检查访问修饰符，即可以访问private所修饰的内容
        declaredConstructor.setAccessible(true);

        //利用构造器来创建一个对象，和静态内部类锁获得的对象进行比较
        StaticClassSingleton staticClassSingleton = declaredConstructor.newInstance();

        //静态内部类的单例实现所获得的对象
        StaticClassSingleton instance = StaticClassSingleton.getInstance();
        System.out.println(instance==staticClassSingleton);
        
    }
    
    @Test
    public void lazySingletonTest() throws Exception {
        Constructor<LazySingleton> declaredConstructor = LazySingleton.class.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        LazySingleton lazySingleton = declaredConstructor.newInstance();

        LazySingleton instance = LazySingleton.getInstance();

        System.out.println(lazySingleton==instance);

    }

    
    @Test
    public void doubleCheckLazySingletonTest() throws Exception{
        Constructor<DoubleCheckLazySingleton> declaredConstructor = DoubleCheckLazySingleton.class.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        DoubleCheckLazySingleton doubleCheckLazySingleton = declaredConstructor.newInstance();

        DoubleCheckLazySingleton instance = DoubleCheckLazySingleton.getInstanceDoubleCheck();

        System.out.println(doubleCheckLazySingleton==instance);
    }

    @Test
    public void hungryTest() throws Exception{
        Constructor<HungrySingleton> declaredConstructor = HungrySingleton.class.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        HungrySingleton hungrySingleton = declaredConstructor.newInstance();

        HungrySingleton instance = declaredConstructor.newInstance();

        System.out.println(hungrySingleton==instance);

    }

    /**
    *
    * @Description: 利用反射机制创建一个通过枚举实现的单例
    * @returns:void
    * @author: cxc
    * @date: 2021/3/17
    */
    @Test
    public void enumSingletonTest() throws Exception{
       /*
            枚举类型的继承关系，可通过javap -v -p EnumSingleton.class 获得
            EnumSingleton extends java.lang.Enum<Singleton.EnumSingleton>

            Enum类的构造函数；
            @param name - The name of this enum constant, which is the identifier
                        used to declare it.
            @param ordinal - The ordinal of this enumeration constant (its position
                  in the enum declaration, where the initial constant is assigned
                  an ordinal of zero).
            protected Enum(String name, int ordinal) {
            this.name = name;
            this.ordinal = ordinal;
            }
        */
        //方法中的两个参数的由来

        Constructor<EnumSingleton> declaredConstructor = EnumSingleton.class.getDeclaredConstructor(String.class,int.class);

        declaredConstructor.setAccessible(true);
        //名称即编号
        EnumSingleton enumSingleton = declaredConstructor.newInstance("INSTANCE",0);
        EnumSingleton instance = EnumSingleton.INSTANCE;
        System.out.println(instance==enumSingleton);

    }
}
