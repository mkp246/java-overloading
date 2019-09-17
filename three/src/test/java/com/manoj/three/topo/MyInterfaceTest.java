package com.manoj.three.topo;

import com.manoj.one.topo.MyHello;
import com.manoj.one.topo.MyInterface;
import com.manoj.two.topo.MyInterfaceImpl;
import org.junit.Assert;
import org.junit.Test;

public class MyInterfaceTest {
    @Test
    public void test() {
        MyInterface myInterface = new MyInterfaceImpl();
        String result = myInterface.hello("me");
        Assert.assertEquals("hello me", result);


        MyHello myHello = new MyHello();
        String me = myHello.doHello(myInterface, "me");
        Assert.assertEquals("hello me", me);
    }
}
