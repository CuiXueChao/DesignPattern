package SingletonPattern;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * @ClassName:SerializableStaticClassSingleton
 * @DESCRIPTION: 序列化方式的单例模式
 * @author: cxc
 * @DATE: 2021/3/17
 */

public class SerializableStaticClassSingleton implements Serializable{

    static final long serialVersionUID = 42L;

    private SerializableStaticClassSingleton(){}

    public static class SingletonHolder{
        private static final SerializableStaticClassSingleton instance=new SerializableStaticClassSingleton();
    }

    public static SerializableStaticClassSingleton getInstance(){
        return SingletonHolder.instance;
    }


    Object readResolve() throws ObjectStreamException{
        return SingletonHolder.instance;
    }
}
