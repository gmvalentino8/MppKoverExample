package io.github.gmvalentino8.tests

import io.github.gmvalentino8.moduleA.GreetingA
import kotlin.test.Test
import kotlin.test.assertTrue

class IosGreetingTest {

    @Test
    fun testExample() {
        assertTrue(GreetingA().greeting().contains("iOS"), "Check iOS is mentioned")
    }
}
