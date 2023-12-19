package com.example.bordelmc.designSystem.component.button

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.bordelmc.designSystem.theme.Shapes

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
        onClick = onClick
    ) {
        Text(text = text)
    }
}