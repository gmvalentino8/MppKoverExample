package io.github.gmvalentino8.moduleB.platform

import platform.UIKit.UIDevice

actual class PlatformB {
    actual val platform: String =
        "${UIDevice.currentDevice.systemName()} ${UIDevice.currentDevice.systemVersion}"
}
