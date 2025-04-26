package test;

import org.testng.annotations.Test;

public class Test2 {
    @Test
    public void testMethod2() {
        System.out.println("Test2: Executing testMethod2 - " + Thread.currentThread().getId());
    }
}
