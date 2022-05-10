package org.ton.wallet

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import org.ton.wallet.color.Colors
import org.ton.wallet.icon.getDownLeftIcon

@Composable
fun App() {
    Column(modifier = Modifier.fillMaxWidth().background(Color.Black)) {
        Row(
            Modifier.padding(10.dp).fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(onClick = { println("Refresh") }) {
                Icon(Icons.Filled.Refresh, "Refresh", Modifier, tint = Colors.Secondary)
            }
            Text("updated just now", color = Colors.Secondary)
            IconButton(onClick = { println() }) {
                Icon(Icons.Filled.Menu, "Menu", Modifier, tint = Colors.Secondary)
            }
        }
        Column(
            modifier = Modifier.padding(bottom = 30.dp, top = 15.dp, start = 10.dp, end = 10.dp).fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row {
                Text("0.00\uD83D\uDC8E", fontSize = (32).sp, color = Color.White)
            }
            Text("Your balance", color = Color.White, modifier = Modifier.padding(top = 11.dp))
        }
        Row(
            Modifier.padding(10.dp).fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Button(
                modifier = Modifier.width(150.dp).padding(horizontal = 12.dp),
                onClick = { println() },
                colors = ButtonDefaults.buttonColors(backgroundColor = Colors.Primary, contentColor = Color.White)
            ) {
                Icon(getDownLeftIcon(), "Receive", Modifier.size(11.dp))
                Text("Recieve", fontSize = (0.85).em, modifier = Modifier.padding(start = 4.dp))
            }
            Button(
                modifier = Modifier.width(150.dp).padding(horizontal = 12.dp),
                onClick = { println() },
                colors = ButtonDefaults.buttonColors(backgroundColor = Colors.Primary, contentColor = Color.White)
            ) {
                Icon(getDownLeftIcon(), "Send", Modifier.size(11.dp).rotate(180.0F))
                Text("Send", fontSize = (0.85).em, modifier = Modifier.padding(start = 4.dp))
            }
        }
    }
}
