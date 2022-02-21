package io.github.gmvalentino8.tests

import io.github.gmvalentino8.moduleA.GreetingA
import org.junit.Assert.assertTrue
import org.junit.Test

class AndroidTestA {
    @Test
    fun testExample() {
        assertTrue("Check Android is mentioned", GreetingA().greeting().contains("Android"))
    }
}
