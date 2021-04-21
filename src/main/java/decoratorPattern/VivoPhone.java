package decoratorPattern;

/**
 * vivo手机，实现拍照接口，该品牌的特点功能是“夜拍是王牌”
 *
 * @ClassName: VivoPhone
 * @DESCRIPTION:
 * @author: cxc
 * @date: 2021/4/20
 */

public class VivoPhone implements Photograph {

    @Override
    public void photograph() {
        System.out.println("vivo夜拍是王牌");
    }
}
