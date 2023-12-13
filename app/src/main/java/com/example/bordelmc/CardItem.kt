package com.example.bordelmc

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bordelmc.ui.theme.BordelMcTheme
import com.example.bordelmc.ui.theme.Shapes

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun CardItem(

) {
    Card(
        modifier = Modifier
            .width(200.dp)
            .height(80.dp),
        shape = Shapes.medium
    ) {
        Column(
            modifier = Modifier
                .width(70.dp)
                .background(Color.White)
                .padding(8.dp)
        ) {
            Text(
                text = "Simple card",
                fontSize = 18.sp
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "Text for descritpion and other things !",
                fontSize = 12.sp
            )
        }
    }
}

@Preview
@Composable
fun CardItemPreview() {
    BordelMcTheme {
        CardItem(
        )
    }
}