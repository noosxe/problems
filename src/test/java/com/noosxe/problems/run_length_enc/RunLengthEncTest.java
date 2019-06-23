package com.noosxe.problems.run_length_enc;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class RunLengthEncTest {

    private RunLengthEnc runLengthEnc;

    @Before
    public void init() {
        runLengthEnc = new RunLengthEnc();
    }

    public void test1() {
        assertEquals("4A3B2C1D2A", runLengthEnc.enc("AAAABBBCCDAA"));
    }
}
