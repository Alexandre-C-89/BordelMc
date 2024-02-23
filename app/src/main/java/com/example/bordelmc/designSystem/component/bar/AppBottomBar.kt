package com.example.bordelmc.designSystem.component.bar

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.BottomAppBar
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.bordelmc.R
import com.example.compose.BordelMcTheme
import com.example.compose.Green40

@Composable
fun AppBottomBar(
    navToHomeScreen: () -> Unit,
    navToNotesScreen: () -> Unit
) {
    BottomAppBar(
        backgroundColor = Green40,
        cutoutShape = CircleShape,
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            IconButton(
                onClick = { navToHomeScreen() }
            ) {
                Icon(
                    imageVector = Icons.Default.Home,
                    contentDescription = "Home",
                    tint = Color.White
                )
            }
            IconButton(
                onClick = { navToNotesScreen() }
            ) {
                Icon(
                    modifier = Modifier
                        .height(25.dp)
                        .width(25.dp),
                    painter = painterResource(id = R.drawable.note_icon),
                    contentDescription = "Search",
                    tint = Color.White
                )
            }
            /**IconButton(
            onClick = { navToProfileScreen() }
            ) {
            Icon(imageVector = Icons.Default.AccountCircle, contentDescription = "Profile", tint = Color.White)
            }*/
        }
        // Add more navigation items
    }
}

@Preview
@Composable
fun AppBottomBarPreview() {
    BordelMcTheme {
        AppBottomBar(
            navToNotesScreen = {},
            navToHomeScreen = {}
        )
    }
}