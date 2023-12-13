package com.example.bordelmc

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.AppBarDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.primarySurface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.bordelmc.ui.theme.BordelMcTheme

@Composable
fun AppBar(
) {
    TopAppBar(
        title = { Text("BordelMc") },
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp),
        backgroundColor = MaterialTheme.colors.primarySurface,
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