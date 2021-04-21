package facadePattern.Material;

/**
 * 珍珠类
 *
 * @ClassName: Pearl
 * @DESCRIPTION:
 * @author: cxc
 * @date: 2021/4/4
 */

public class Pearl {
    private static Pearl pearl = new Pearl();

    private Pearl() {
    }

    public static Pearl getPearl() {
        return pearl;
    }

    @Override
    public String toString() {
        return "获得珍珠原料";
    }
}
