package io.github.gmvalentino8.moduleA

class GreetingA {
    fun greeting(): String {
        return "Hello, ${PlatformA().platform}!"
    }
}
