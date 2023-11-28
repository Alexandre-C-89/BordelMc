package com.example.bordelmc.ui.component.text

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.example.bordelmc.ui.theme.SublimeGold

object Title {

    @Composable
    fun Big(text: String) = Text(
        modifier = Modifier.fillMaxWidth(),
        text = text,
        style = TextStyle(
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            //fontFamily = fonts,
            textAlign = TextAlign.Start,
            color = Color.Black
        )
    )

    @Composable
    fun Default(text: String) = Text(
        modifier = Modifier.fillMaxWidth(),
        text = text,
        style = TextStyle(
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            //fontFamily = fonts,
            textAlign = TextAlign.Start,
            color = Color.Black
        )
    )

    @Composable
    fun Subtitle(text: String) = Text(
        modifier = Modifier.fillMaxWidth(),
        text = text,
        style = TextStyle(
            fontSize = 16.sp,
            fontWeight = FontWeight.Medium,
            //fontFamily = fonts,
            textAlign = TextAlign.Start,
            color = Color.Black
        )
    )

    @Composable
    fun StepTitle(text: String) = Text(
        modifier = Modifier.fillMaxWidth(),
        text = text,
        style = TextStyle(
            fontSize = 10.sp,
            fontWeight = FontWeight.Normal,
            //fontFamily = fonts,
            textAlign = TextAlign.Start,
            color = SublimeGold
        )
    )

}
