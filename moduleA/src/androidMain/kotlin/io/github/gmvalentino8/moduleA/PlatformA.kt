package io.github.gmvalentino8.moduleA

actual class PlatformA {
    actual val platform: String = "Android ${android.os.Build.VERSION.SDK_INT}"
}
