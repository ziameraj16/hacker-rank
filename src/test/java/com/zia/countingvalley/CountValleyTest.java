package com.zia.countingvalley;

import junit.framework.TestCase;
import org.junit.Test;

public class CountValleyTest extends TestCase {

    @Test
    public void testCountingValleys() {
        assertEquals(1, CountValley.countingValleys("UDDDUDUU"));
    }
}