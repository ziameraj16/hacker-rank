package com.zia.equalizearray;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void equalizeArray() {

        Assert.assertEquals(2, Solution.equalizeArray(new int[]{3, 3, 2, 1, 3}));
    }
}