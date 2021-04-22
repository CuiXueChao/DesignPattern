package observerPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 观察者模式的主体对象
 *
 * @PROJECT_NAME: DesignPattern
 * @ClassName: PublicWechat
 * @DESCRIPTION:
 * @author: cxc
 * @date: 2021/4/22
 */

public class PublicWechat {
    /**
     * 定义容器来存放观察者
     */
    private List<Observer> container = new ArrayList<Observer>();

    /**
     * 将观察者存放至主题对象的容器的方法
     *
     * @param observer 观察者
     * @author cxc
     * @date: 2021/4/22
     */
    public void addObserver(Observer observer) {
        container.add(observer);
    }

    /**
     * 从主体对象中删除观察者
     *
     * @param observer 观察者
     * @author cxc
     * @date: 2021/4/22
     */
    public void delObserver(Observer observer) {
        container.remove(observer);
    }


    /**
     * 通知方法---传入一个消息对象（修改对象）
     *
     * @param o 消息对象
     * @author cxc
     * @date: 2021/4/22
     */
    public void notifyObserver(Object o) {
        //遍历观察者容器实现全部的通知功能
        for (Observer observer : container) {
            observer.messaged(o);
        }
        //container.forEach(observer -> observer.messaged(o));
    }
}
