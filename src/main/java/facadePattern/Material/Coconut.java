package facadePattern.Material;

/**
 * 椰果类
 *
 * @ClassName: Coconut
 * @DESCRIPTION:
 * @author: cxc
 * @date: 2021/4/4
 */

public class Coconut {
    private static Coconut coconut = new Coconut();

    private Coconut() {
    }

    public static Coconut getCoconut() {
        return coconut;
    }

    @Override
    public String toString() {
        return "获得椰果原料";
    }
}
