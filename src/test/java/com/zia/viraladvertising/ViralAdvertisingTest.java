package com.zia.viraladvertising;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ViralAdvertisingTest {

    @Test
    public void viralAdvertising() {
        assertEquals(ViralAdvertising.viralAdvertising(1), 2);
        assertEquals(ViralAdvertising.viralAdvertising(2), 5);
        assertEquals(ViralAdvertising.viralAdvertising(3), 9);
        assertEquals(ViralAdvertising.viralAdvertising(4), 15);
        assertEquals(ViralAdvertising.viralAdvertising(5), 24);
    }
}