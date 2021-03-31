package singletonPattern;

/**
 * @ClassName:StaticClassSingleton
 * @DESCRIPTION:
 * @author: cxc
 * @DATE: 2021/3/15
 */

public class StaticClassSingleton{

    private StaticClassSingleton(){}

    public static class SingletonHolder{
        private static final StaticClassSingleton instance=new StaticClassSingleton();
    }

    public static StaticClassSingleton getInstance(){
        return SingletonHolder.instance;
    }
}
