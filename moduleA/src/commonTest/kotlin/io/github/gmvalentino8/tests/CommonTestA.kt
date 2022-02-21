package io.github.gmvalentino8.tests

import io.github.gmvalentino8.moduleA.GreetingA
import kotlin.test.Test
import kotlin.test.assertTrue

class CommonTestA {
    @Test
    fun testExample() {
        assertTrue(GreetingA().greeting().contains("Hello"), "Check Hello is mentioned")
    }
}
