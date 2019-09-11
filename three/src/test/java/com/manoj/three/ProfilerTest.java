package com.manoj.three;

import com.manoj.two.ProfilerTester;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProfilerTest {
    @Test
    public void testProfileVMWARE() {
        ProfilerTester tester = new ProfilerTester();
        String message = tester.profileVMWARE();
        assertEquals("profile node node 1 for type VMWARE", message);
    }

    @Test
    public void testProfileACI() {
        ProfilerTester tester = new ProfilerTester();
        String message = tester.profileACI();
        assertEquals("profile node node 1 for type CISCOACI", message);
    }

    @Test
    public void testProfileMeraki() {
        ProfilerTester tester = new ProfilerTester();
        String message = tester.profileMeraki();
        assertEquals("profile node node 1 for type MERAKI", message);
    }
}
