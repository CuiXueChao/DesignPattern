package facadePattern;

import facadePattern.Material.Coconut;
import facadePattern.Material.Pearl;

/**
 * 外观模式类
 *
 * @ClassName: Facade
 * @DESCRIPTION: 在此模仿CoCo奶茶店的门面（外观模式==门面模式）
 * @author: cxc
 * @date: 2021/4/4
 */

public class CoCoFacade {

    /**
     * 所有复杂的流程交给CoCo官方来做，原材料由由他们来采购，我们的奶茶店加盟之后
     * 就可以直接进行制作
     *
     * @author cxc
     * @date: 2021/4/4
     */
    public static void materialLoad() {
        Pearl pearl = Pearl.getPearl();
        Coconut coconut = Coconut.getCoconut();
        System.out.println(pearl);
        System.out.println(coconut);
        System.out.println("将原材料配发至加盟商");
    }
}
