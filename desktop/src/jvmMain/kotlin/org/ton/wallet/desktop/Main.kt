package org.ton.wallet.desktop// Copyright 2000-2021 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import org.ton.wallet.App

fun main() = application {
    Window(onCloseRequest = ::exitApplication, title = "TON Wallet", icon = painterResource("images/icon.png")) {
        App()
    }
}
