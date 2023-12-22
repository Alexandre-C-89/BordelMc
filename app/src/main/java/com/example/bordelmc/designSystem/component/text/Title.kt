package com.example.bordelmc.designSystem.component.text

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.example.bordelmc.designSystem.theme.OpenSansFont
import com.example.compose.Blue30

object Title {

    @Composable
    fun Big(text: String) = Text(
        modifier = Modifier.fillMaxWidth(),
        text = text,
        style = TextStyle(
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = OpenSansFont,
            textAlign = TextAlign.Start,
            color = Blue30
        )
    )

    @Composable
    fun Default(text: String) = Text(
        modifier = Modifier.fillMaxWidth(),
        text = text,
        style = TextStyle(
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = OpenSansFont,
            textAlign = TextAlign.Start,
            color = Blue30
        )
    )

    @Composable
    fun Subtitle(text: String) = Text(
        modifier = Modifier.fillMaxWidth(),
        text = text,
        style = TextStyle(
            fontSize = 16.sp,
            fontWeight = FontWeight.Medium,
            fontFamily = OpenSansFont,
            textAlign = TextAlign.Start,
            color = Blue30
        )
    )

    @Composable
    fun StepTitle(text: String) = Text(
        modifier = Modifier.fillMaxWidth(),
        text = text,
        style = TextStyle(
            fontSize = 10.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = OpenSansFont,
            textAlign = TextAlign.Start,
            color = Blue30
        )
    )

}