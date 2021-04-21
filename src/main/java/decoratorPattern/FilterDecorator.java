package decoratorPattern;

/**
 * @PROJECT_NAME: DesignPattern
 * @ClassName: FilterDecorator
 * @DESCRIPTION:
 * @author: cxc
 * @date: 2021/4/20
 */

public class FilterDecorator implements Photograph {

    private Photograph photograph;

    public FilterDecorator(Photograph photograph) {
        this.photograph = photograph;
    }

    @Override
    public void photograph() {
        //增加滤镜功能
        System.out.println("添加滤镜功能");
        photograph.photograph();
    }
}
