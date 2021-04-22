package observerPattern;

/**
 * 观察者应具有的属性
 *
 * @PROJECT_NAME: DesignPattern
 * @ClassName: Observer
 * @DESCRIPTION:
 * @author: cxc
 * @date: 2021/4/22
 */

public interface Observer {
    /**
     * 发放/接受通知
     *
     * @param object 消息对象
     * @author cxc
     * @date: 2021/4/22
     */
    void messaged(Object object);
}
