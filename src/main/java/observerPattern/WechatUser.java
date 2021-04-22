package observerPattern;

/**
 * 具体的观察者
 *
 * @PROJECT_NAME: DesignPattern
 * @ClassName: WechatUser
 * @DESCRIPTION:
 * @author: cxc
 * @date: 2021/4/22
 */

public class WechatUser implements Observer {
    private String name;

    public WechatUser(String name) {
        this.name = name;
    }

    /**
     * 所收到的消息
     *
     * @param object 消息对象，由主体对象进行调用
     * @author cxc
     * @date: 2021/4/22
     */
    @Override
    public void messaged(Object object) {
        System.out.println(this.name + "，获取到消息对象---" + object);
    }
}
