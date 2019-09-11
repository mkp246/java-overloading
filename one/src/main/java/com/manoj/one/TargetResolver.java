package com.manoj.one;

import java.util.List;

public interface TargetResolver {
    List<String> resolve(NetworkProtocolType type);
}
