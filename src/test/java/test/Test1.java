package test;

import org.testng.annotations.Test;

public class Test1 {
    @Test
    public void testMethod1() {
        System.out.println("Test1: Executing testMethod1 - " + Thread.currentThread().getId());
    }
}
