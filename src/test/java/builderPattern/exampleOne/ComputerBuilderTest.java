package builderPattern.exampleOne;

import org.junit.Test;

import static org.junit.Assert.*;

public class ComputerBuilderTest {

    @Test
    public void computerBuildTest(){
        //所需的产品
        DefaultProductBuilder defaultProductBuilder = new DefaultProductBuilder();
        //具体的构建类
        Director director = new Director(defaultProductBuilder);
        Computer computer = director.makeDefaultComputer("华硕主板、", "金士顿", "追风者");
        System.out.println(computer);
    }
}