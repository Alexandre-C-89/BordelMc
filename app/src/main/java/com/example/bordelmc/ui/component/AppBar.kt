package com.example.bordelmc.ui.component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.bordelmc.ui.theme.BordelMcTheme

@Composable
fun AppBar(
    modifier: Modifier = Modifier
        .fillMaxWidth(),
    title: String = "",
) {
    AppBar(
        modifier = Modifier,
        title = "BordelMc",
    )
}

@Preview
@Composable
fun AppBarPreview() {
    BordelMcTheme {
        AppBar()
    }
}