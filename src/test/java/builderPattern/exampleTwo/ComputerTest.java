package builderPattern.exampleTwo;

import org.junit.Test;

import static org.junit.Assert.*;

public class ComputerTest {

    @Test
    public void insideClassBuildTest(){
        //构建对象的
        Computer.Builder builder = new Computer.Builder();
        //链式调用
        builder.buildMainBoard("华硕主板").buildBox("普通机箱");
        builder.buildMemory("金士顿");
        //此方法创建对象,只能执行一次（该方法每次执行都会执行new Computer(...)）
        Computer build = builder.build();
        System.out.println(build);
    }
}