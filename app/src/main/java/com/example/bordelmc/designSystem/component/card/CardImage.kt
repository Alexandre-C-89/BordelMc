package com.example.bordelmc.designSystem.component.card

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import com.example.bordelmc.data.OptionsList
import com.example.bordelmc.designSystem.theme.LightBlue
import com.example.bordelmc.designSystem.theme.Shapes

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