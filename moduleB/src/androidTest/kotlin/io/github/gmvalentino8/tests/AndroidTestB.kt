package io.github.gmvalentino8.tests

import io.github.gmvalentino8.moduleB.GreetingB
import org.junit.Assert.assertTrue
import org.junit.Test

class AndroidTestB {

    @Test
    fun testExample() {
        assertTrue("Check Android is mentioned", GreetingB().greeting().contains("Android"))
    }
}
