package observerPattern;

import org.junit.jupiter.api.Test;

class WechatUserTest {

    @Test
    void ObserverTest() {
        //公众号对象
        PublicWechat publicWechat = new PublicWechat();
        //观察者对象
        WechatUser cxc = new WechatUser("崔学超");
        WechatUser sxy = new WechatUser("孙昕雨");

        //微信用户关注该公众号
        publicWechat.addObserver(cxc);
        publicWechat.addObserver(sxy);

        //公众号发文
        publicWechat.notifyObserver("今天晚上将发送一个福利视频");


    }
}