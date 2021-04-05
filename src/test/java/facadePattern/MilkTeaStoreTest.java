package facadePattern;

import org.junit.Test;

import static org.junit.Assert.*;

public class MilkTeaStoreTest {
@Test
public void milkTeaTest(){
    MilkTeaStore milkTeaStore = new MilkTeaStore();
    milkTeaStore.makeMilkTea();

    milkTeaStore.makeCoCoMilkTea();
}
}