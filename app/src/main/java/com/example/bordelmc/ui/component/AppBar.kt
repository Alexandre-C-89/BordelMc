package com.example.bordelmc.ui.component

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.bordelmc.R
import com.example.bordelmc.ui.theme.Blue
import com.example.bordelmc.ui.theme.BordelMcTheme
import com.example.bordelmc.ui.theme.White

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppBar(

) {
    TopAppBar(
        title = { stringResource(R.string.appTitle) },
        colors = TopAppBarDefaults.smallTopAppBarColors(titleContentColor = White, containerColor = Blue)
    )
}

@Preview
@Composable
fun AppBarPreview() {
    BordelMcTheme {
        AppBar()
    }
}