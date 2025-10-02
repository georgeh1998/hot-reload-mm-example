package com.github.georgeh1998.desktopapp

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "desktopApp",
    ) {
        App()
    }
}