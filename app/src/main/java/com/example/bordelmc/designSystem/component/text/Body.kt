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

object Body {

    @Composable
    fun Big(text: String) = Text(
        modifier = Modifier.fillMaxWidth(),
        text = text,
        style = TextStyle(
            fontSize = 16.sp,
            fontWeight = FontWeight.SemiBold,
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
            fontSize = 12.sp,
            fontWeight = FontWeight.Normal,
            fontFamily = OpenSansFont,
            textAlign = TextAlign.Start,
            color = Blue30
        )
    )

    @Composable
    fun Small(text: String) = Text(
        modifier = Modifier.fillMaxWidth(),
        text = text,
        style = TextStyle(
            fontSize = 8.sp,
            fontWeight = FontWeight.Light,
            fontFamily = OpenSansFont,
            textAlign = TextAlign.Start,
            color = Blue30
        )
    )

}