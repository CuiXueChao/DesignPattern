package SingletonPattern.lazy;

/**
 * @ClassName:LazySingleton
 * @DESCRIPTION: 懒汉式的单例模式，代码量多
 * @author: cxc
 * @DATE: 2021/3/15
 */

public class LazySingleton {
    public static LazySingleton instance;

    private LazySingleton() {
    }

    /**
    *
    * @Description: 普通懒加载--线程不安全
    * @returns:Singleton.LazySingleton
    * @author: cxc
    * @date: 2021/3/17
    */
    public static LazySingleton getInstance(){
        if (instance==null) {
            instance = new LazySingleton();
        }
        return instance;
    }

}
