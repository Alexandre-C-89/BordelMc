package com.example.bordelmc.designSystem.component.button

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AppButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    text: String,
    enabled: Boolean = true,
    painter: Painter
) {
    Button(
        modifier = modifier.height(45.dp),
        shape = RoundedCornerShape(6.dp),
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            /**disabledContainerColor = Theme.colorPalette.buttonPrimaryDisabled,
            containerColor = Theme.colorPalette.buttonPrimary*/
        ),
        enabled = enabled
    ) {
        Icon(painter = painter, contentDescription = "logo, img and other things for button")
        Text(
            text = text,
            fontSize = 16.sp,
            fontWeight = FontWeight.SemiBold
        )
    }
}