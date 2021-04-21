package decoratorPattern;

/**
 * @ClassName: DesignPattern
 * @DESCRIPTION:
 * @author: cxc
 * @date: 2021/4/20
 */

public class CloudDecorator implements Photograph {

    /**
     * 持有功能的接口
     */
    private Photograph function;

    public CloudDecorator(Photograph function) {
        this.function = function;
    }

    @Override
    public void photograph() {
        //在此进行功能的扩展
        System.out.println("增加超稳微云台功能");
        //原有功能的实现
        function.photograph();
    }
}
