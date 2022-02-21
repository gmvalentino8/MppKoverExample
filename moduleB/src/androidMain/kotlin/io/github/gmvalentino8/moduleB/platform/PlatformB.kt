package io.github.gmvalentino8.moduleB.platform

import android.os.Build

actual class PlatformB {
    actual val platform: String = "Android ${Build.VERSION.SDK_INT}"
}
