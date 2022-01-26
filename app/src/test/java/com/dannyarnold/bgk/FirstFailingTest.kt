package com.dannyarnold.bgk

import org.junit.Assert
import org.junit.Test

class FirstFailingTest {

    @Test
    fun failingTest() {
        Assert.assertEquals(0,1)
    }
}