package facadePattern;

import facadePattern.Material.Coconut;
import facadePattern.Material.Pearl;

/**
 * 想做一杯奶茶，但没有渠道去弄原材料（珍珠，椰果。。。）
 *
 * @ClassName: MilkTeaStore
 * @DESCRIPTION:
 * @author: cxc
 * @date: 2021/4/4
 */

public class MilkTeaStore {

    /**
     * 自己制作奶茶
     *
     * @Description: 过程繁琐，需要了解如何进货，增加了学习成本
     * @author cxc
     * @date: 2021/4/4
     */
    public void makeMilkTea() {
        Pearl pearl = Pearl.getPearl();
        Coconut coconut = Coconut.getCoconut();
        System.out.println(pearl);
        System.out.println(coconut);
        System.out.println("制作奶茶");
    }

    /**
     * 将繁琐的原料加载交由加盟商来做，只需要品牌方将进货的方式告诉加盟商，没原料了就会
     * 直接配送。
     *
     * @Description: 即为复杂的模块或子系统提供外界访问的模块，直接通过此模块来进行
     * 调用。
     * @author cxc
     * @date: 2021/4/4
     */
    public void makeCoCoMilkTea() {
        CoCoFacade.materialLoad();
        System.out.println("制作CoCo奶茶");
    }
}
