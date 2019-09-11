package com.manoj.one;

import java.util.Collections;
import java.util.List;

public class TargetResolverImpl implements TargetResolver {
    @Override
    public List<String> resolve(String type) {
        return Collections.singletonList(type);
    }
}
