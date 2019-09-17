package com.manoj.one.topo;

public class MyHello {
    public String doHello(MyInterface myInterface, String name) {
        return myInterface.hello(name, name);
    }
}
