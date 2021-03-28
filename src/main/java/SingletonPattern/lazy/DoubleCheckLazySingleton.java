package SingletonPattern.lazy;

/**
 * @ClassName:DoubleCheckLazySingleton
 * @DESCRIPTION:
 * @author: cxc
 * @DATE: 2021/3/18
 */

public class DoubleCheckLazySingleton {

    /*加上 volatile 关键字，防止指令重排序*/

    public volatile static DoubleCheckLazySingleton instance;

    private DoubleCheckLazySingleton() {
    }
    /**
     *
     * @Description: 线程安全-双重校验锁
     * @returns:Singleton.LazySingleton
     * @author: cxc
     * @date: 2021/3/15
     */
    public static DoubleCheckLazySingleton getInstanceDoubleCheck(){
        //当instance存在不创建实例
        if (instance==null) {
            //当两个线程同时执行到此处，同样会创建两个实例
            synchronized (DoubleCheckLazySingleton.class){
                //此处增加第二处校验，防止创建多个实例
                if (instance==null) {
                    instance = new DoubleCheckLazySingleton();
                }
            }

        }
        return instance;
    }
}
