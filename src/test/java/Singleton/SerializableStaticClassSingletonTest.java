package Singleton;

import singletonPattern.SerializableStaticClassSingleton;
import org.junit.Test;

import java.io.*;

/**
 * @ClassName:SerializableStaticClassSingletonTest
 * @DESCRIPTION:
 * @author: cxc
 * @DATE: 2021/3/17
 */

public class SerializableStaticClassSingletonTest {
    //获取序列化的静态内部类的单例实例
    SerializableStaticClassSingleton instance = SerializableStaticClassSingleton.getInstance();

    /**
    *
    * @Description: 写入操作
    * @returns:void
    * @author: cxc
    * @date: 2021/3/17
    */
    @Test
    public void outPutTest()throws Exception{
        //获取流并写入文件“serializableTest”中,执行一次即可
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("serializableTest"));
        oos.writeObject(instance);
        oos.close();
    }



    /** 
    * 
    * @Description: 通过序列化所持久化的单例和通过类直接取到的实例并非同一个实例
    * @returns:void
    * @author: cxc
    * @date: 2021/3/17
    */
    @Test
    public void serializableTest1() throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("serializableTest"));
        SerializableStaticClassSingleton o = ((SerializableStaticClassSingleton) ois.readObject());

        //false
        System.out.println(o == instance);
        //Assert.assertSame(o,instance);
    }

    /** 
    * 
    * @Description: 序列化的单例实现
    * @returns:void
    * @author: cxc
    * @date: 2021/3/17
    */
    @Test
    public void serializableTest2() throws Exception {
        /*Classes that need to designate a replacement when an instance of it
         * is read from the stream should implement this special method with the
         * exact signature.
         *
         * <PRE>
         * ANY-ACCESS-MODIFIER Object readResolve() throws ObjectStreamException;
         * </PRE><p>*/

        /*需在类中，实现一个特殊的方法，并且需要声明serialVersionUID
         * 重新执行写入方法。再执行*/

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("serializableTest"));

        /*查看对象的获取，readObject()方法
        * 该方法会使用readObject0()方法进行对象的获取
        * switch (tc) {
                case TC_ENUM:
                    return checkResolve(readEnum(unshared));

                case TC_OBJECT:
                    return checkResolve(readOrdinaryObject(unshared));
            这是其中获取OBJECT和ENUM类型的具体方法
        *
        * readOrdinaryObject(unshared)中存在此方法desc.hasReadResolveMethod()来判断是否实现了readResolve()方法，来返回特殊的实例对象。
        *
        * 枚举类型，本身支持序列化的操作，无需附加任何操作，原因可从readEnum(unshared)中寻找。
        * */
        SerializableStaticClassSingleton o = ((SerializableStaticClassSingleton) ois.readObject());

        System.out.println(o == instance);
       
    }
}
