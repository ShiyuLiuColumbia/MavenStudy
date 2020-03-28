package com.imooc.maven01.model;

import org.junit.*;
import org.junit.Assert.*;
public class TestHelloWorld {
    @Test
    public void testHello(){
        Assert.assertEquals("HELLO", new HelloWorld().sayHello());
    }
}
