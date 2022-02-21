package io.github.gmvalentino8.tests

import io.github.gmvalentino8.moduleB.GreetingB
import kotlin.test.Test
import kotlin.test.assertTrue

class IosTestB {

    @Test
    fun testExample() {
        assertTrue(GreetingB().greeting().contains("iOS"), "Check iOS is mentioned")
    }
}
