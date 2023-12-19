package com.example.bordelmc.designSystem.component

import android.content.Context
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bordelmc.R
import com.example.bordelmc.designSystem.component.button.ButtonItem
import com.example.bordelmc.designSystem.theme.BordelMcTheme
import com.example.bordelmc.designSystem.theme.Shapes

@Composable
fun CardImageItem(
    context: Context
) {
    Card(
        shape = Shapes.medium,
        elevation = 16.dp
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painterResource(id = R.drawable.profile_photo),
                contentDescription = "photo de profile"
            )
            Column(
                modifier = Modifier
                    .padding(5.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    color = Color.Blue,
                    fontSize = 24.sp,
                    style = MaterialTheme.typography.h4,
                    text = "Miles P."
                )

                Text(
                    text = "Androdi Compose Programmer",
                    modifier = Modifier.padding(3.dp)
                )

                Text(
                    text = "@JetpackCompose",
                    modifier = Modifier.padding(3.dp),
                    style = MaterialTheme.typography.subtitle1
                )
            }
            ButtonItem(
                context = context,
                text = "Profile",
                onClick = { }
            )
        }
    }
}

@Preview
@Composable
fun CardPreview() {
    BordelMcTheme {
        CardImageItem(
            context = LocalContext.current
        )
    }
}