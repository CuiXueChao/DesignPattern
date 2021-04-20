package decoratorPattern;

import org.junit.jupiter.api.Test;

/**
 * 对拍照功能的扩展，动态的增加功能且不修改原有的代码
 *
 * @ClassName: VivoPhoneTest
 * @DESCRIPTION:
 * @author: cxc
 * @DATE: 2021-04-20
 */
class VivoPhoneTest {

    @Test
    void vivoFirstTest() {
        Photograph vivoPhone = new VivoPhone();
        vivoPhone.photograph();
    }

    @Test
    void vivoSecondTest() {
        Photograph vivoPhone = new CloudDecorator(new VivoPhone());
        vivoPhone.photograph();

    }

    @Test
    void vivoThirdTest() {
        Photograph vivoPhone = new FilterDecorator(new CloudDecorator(new VivoPhone()));
        vivoPhone.photograph();
    }
}