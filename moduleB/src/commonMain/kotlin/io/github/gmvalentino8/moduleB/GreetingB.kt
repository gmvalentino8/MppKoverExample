package io.github.gmvalentino8.moduleB

class GreetingB {
    fun greeting(): String {
        return "Hello, ${PlatformB().platform}!"
    }
}
