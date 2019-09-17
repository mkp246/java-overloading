package com.manoj.two.topo;

import com.manoj.one.topo.MyInterface;

public class MyInterfaceImpl implements MyInterface {
    @Override
    public String hello(String name) {
        return "hello " + name;
    }
}
