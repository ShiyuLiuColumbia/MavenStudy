package com.imooc.maven02.util;

import org.junit.*;
import org.junit.Assert.*;
public class TestSpeak {
    @Test
    public void testSayHi(){
        Assert.assertEquals("HELLO", new Speak().sayHi());
    }
}