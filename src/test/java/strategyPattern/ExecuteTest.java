package strategyPattern;

import org.junit.jupiter.api.Test;

class ExecuteTest {

    @Test
    void addTest() {
        Execute execute = new Execute(10, 20, new AddStrategy());
        int i = execute.executeCount();
        System.out.println(i);
    }

    @Test
    void subTest() {
        Execute execute = new Execute(10, 20, new SubStrategy());
        int i = execute.executeCount();
        System.out.println(i);
    }
}
