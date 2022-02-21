package io.github.gmvalentino8.moduleA

import platform.UIKit.UIDevice

actual class PlatformA {
    actual val platform: String =
        "${UIDevice.currentDevice.systemName()} ${UIDevice.currentDevice.systemVersion}"
}
