package com.manoj.one.profiler;

import com.manoj.one.NetworkProtocolType;
import com.manoj.one.TargetResolver;
import com.manoj.one.TargetResolverImpl;

import java.util.List;

public class Profiler {
    private final TargetResolver resolver;

    public Profiler() {
        resolver = new TargetResolverImpl();
    }

    public String profile(String nodeName, NetworkProtocolType type) {
        List<String> types = resolver.resolve(type.name());
        return "profile node " + nodeName + " for type " + types.get(0);
    }

    public String profile(String nodeName, String type) {
        List<String> types = resolver.resolve(type);
        return "profile node " + nodeName + " for type " + types.get(0);
    }
}
