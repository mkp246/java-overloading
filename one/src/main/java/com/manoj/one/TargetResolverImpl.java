package com.manoj.one;

import java.util.Collections;
import java.util.List;

public class TargetResolverImpl implements TargetResolver {
    public List<String> resolve(NetworkProtocolType type) {
        return Collections.singletonList(type.name());
    }
}
