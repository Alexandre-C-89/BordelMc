package com.example.bordelmc

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.BottomAppBar
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.bordelmc.ui.theme.BordelMcTheme

@Composable
fun AppBottomBar(
) {
    BottomAppBar(
        contentColor = Color.LightGray,
        cutoutShape = CircleShape,
        content = {
            Row (
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround
            ){
                IconButton(
                    onClick = { /* Handle navigation icon click */ }
                ) {
                    Icon(imageVector = Icons.Default.Home, contentDescription = "Home")
                }

                IconButton(
                    onClick = { /* Handle navigation icon click */ }
                ) {
                    Icon(imageVector = Icons.Default.Search, contentDescription = "Search")
                }

                IconButton(
                    onClick = { /* Handle navigation icon click */ }
                ) {
                    Icon(imageVector = Icons.Default.AccountCircle, contentDescription = "Profile")
                }
            }
        }
    )
}

@Preview
@Composable
fun AppBottomBarPreview() {
    BordelMcTheme {
        AppBottomBar(

        )
    }
}