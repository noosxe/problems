package com.noosxe.problems.run_length_dec;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class RunLengthDecTest {

    private RunLengthDec runLengthDec;

    @Before
    public void init() {
        runLengthDec = new RunLengthDec();
    }

    @Test
    public void test0() {
        assertEquals("", runLengthDec.dec(""));
    }

    @Test
    public void test1() {
        assertEquals("AAABBCDDD", runLengthDec.dec("3A2B1C3D"));
    }
}
