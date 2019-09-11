package com.manoj.two;

import com.manoj.one.NetworkProtocolType;
import com.manoj.one.profiler.Profiler;

public class ProfilerTester {

    public String profileVMWARE() {
        Profiler profiler = new Profiler();
        return profiler.profile("node 1", NetworkProtocolType.VMWARE);
    }

    public String profileACI() {
        Profiler profiler = new Profiler();
        return profiler.profile("node 1", NetworkProtocolType.CISCOACI);
    }

    public String profileMeraki() {
        Profiler profiler = new Profiler();
        return profiler.profile("node 1", "MERAKI");
    }
}
