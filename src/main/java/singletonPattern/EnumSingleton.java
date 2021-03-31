package singletonPattern;

/**
 * @ClassName:EnumSingleton
 * @DESCRIPTION: 利用枚举的机制来实现单例
 * @author: cxc
 * @DATE: 2021/3/17
 */

public enum EnumSingleton {
    /**
    ** @param null
    * @Description: 枚举单例
    * @returns:
    * @author: cxc
    * @date: 2021/3/19
    */
    INSTANCE{
        int a=0;
        int b=0;

        public int getA() {
            return a;
        }

        public void setA(int a) {
            this.a = a;
        }

        @Override
        public String toString() {
            return "$classname{" +
                    "a=" + a +
                    ", b=" + b +
                    '}';
        }


    }


}
