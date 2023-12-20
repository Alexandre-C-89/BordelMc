package com.example.bordelmc.designSystem.component.button

import android.content.Context
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.bordelmc.designSystem.theme.Shapes
import com.example.compose.Orange40
import com.example.compose.Orange80

@Composable
fun ButtonItem(
    context: Context,
    text: String,
    onClick: () -> Unit
) {
    Button(
        modifier = Modifier
            .width(100.dp)
            .height(50.dp),
        shape = Shapes.large,
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(Orange80)
    ) {
        Text(text = text)
    }
}