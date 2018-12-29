package com.stackroute;

import org.junit.Test;

import static org.junit.Assert.*;

public class PatternTest {
    Pattern pattern = new Pattern();

    @Test
    public void patternTestCheck1() {
        int[]num={1, 2, 2, 3, 3, 3, 4, 4, 4, 4 } ;
        int numin[];
        numin = pattern.patternCheck(4, num.length);
        for (int i = 0; i < 10; i++) {
            assertEquals(num[i], numin[i]);
        }
    }
}