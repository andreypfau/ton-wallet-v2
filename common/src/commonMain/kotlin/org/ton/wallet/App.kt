package org.ton.wallet

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import org.ton.wallet.color.Colors

@Composable
fun App() {
    Column(modifier = Modifier.fillMaxWidth().background(Color.Black)) {
        Row(
            Modifier.padding(10.dp).fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(onClick = { println() }) {
                Icon(Icons.Filled.Refresh, "Refresh", Modifier, tint = Colors.Primary)
            }
            Text("updated just now", color = Colors.Primary)
            IconButton(onClick = { println() }) {
                Icon(Icons.Filled.Menu, "Menu", Modifier, tint = Colors.Primary)
            }
        }
        Column(
            modifier = Modifier.padding(bottom = 30.dp, top = 15.dp, start = 10.dp, end = 10.dp).fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row {
                Text("0.00\uD83D\uDC8E", fontSize = (32).sp, color = Color.White)
            }
            Text("Your balance", color = Color.White, modifier = Modifier.padding(top = 10.dp))
        }
    }
}
