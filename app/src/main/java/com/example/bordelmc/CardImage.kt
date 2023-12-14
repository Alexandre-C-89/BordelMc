package com.example.bordelmc

import android.content.Context
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.bordelmc.ui.theme.BordelMcTheme
import com.example.bordelmc.ui.theme.LightBlue
import com.example.bordelmc.ui.theme.Shapes

@Composable
fun CardImageItem(
    optionsList: OptionsList,
    //context: Context = LocalContext.current.applicationContext
) {
    Card(
        modifier = Modifier
            .width(350.dp)
            .height(150.dp)
            .background(LightBlue),
        shape = Shapes.medium
    ) {
        Image(
            imageVector = optionsList.icon,
            contentDescription = null,
            contentScale = ContentScale.Crop
        )
    }
}