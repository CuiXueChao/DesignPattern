package SingletonPattern.lazy;

/**
 * @ClassName:SynLazySingleton
 * @DESCRIPTION:
 * @author: cxc
 * @DATE: 2021/3/18
 */

public class SynLazySingleton {
    public static SynLazySingleton instance;

    private SynLazySingleton() {
    }
    /**
     *
     * @Description: 线程安全-方法加锁，效率低下，不建议使用
     * @returns:Singleton.LazySingleton
     * @author: cxc
     * @date: 2021/3/15
     */
    public synchronized static SynLazySingleton getInstanceSyn(){
        if (instance==null) {
            instance = new SynLazySingleton();
        }
        return instance;
    }

}
