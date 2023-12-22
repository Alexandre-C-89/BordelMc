package com.example.bordelmc.designSystem.component.bar

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.AppBarDefaults
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose.BordelMcTheme
import com.example.compose.Green40

@Composable
fun AppBar(
) {
    TopAppBar(
        title = { Text("BordelMc", color = Color.White) },
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp),
        backgroundColor = Green40,
        elevation = AppBarDefaults.TopAppBarElevation
    )
}

@Preview
@Composable
fun AppBarPreview() {
    BordelMcTheme {
        AppBar(

        )
    }
}