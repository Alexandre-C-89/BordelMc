package com.example.bordelmc.home

import android.annotation.SuppressLint
import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AccountBox
import androidx.compose.material.icons.outlined.DateRange
import androidx.compose.material.icons.outlined.ExitToApp
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.LocationOn
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.outlined.PlayArrow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.bordelmc.designSystem.component.bar.AppBar
import com.example.bordelmc.designSystem.component.bar.AppBottomBar
import com.example.bordelmc.designSystem.component.card.CardImageItem
import com.example.bordelmc.designSystem.component.card.CardItem
import com.example.bordelmc.data.OptionsList
import com.example.bordelmc.designSystem.component.button.ButtonItem
import com.example.compose.BordelMcTheme

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun HomeScreen(
    navToHomeScreen: () -> Unit,
    navToProfileScreen: () -> Unit,
    navToSearchScreen: () -> Unit
) {
    fun prepareOptionsList(): MutableList<OptionsList> {
        val optionsList = mutableListOf<OptionsList>()

        optionsList.add(OptionsList(icon = Icons.Outlined.Favorite, option = "Saved Items"))
        optionsList.add(OptionsList(icon = Icons.Outlined.PlayArrow, option = "Payment History"))
        optionsList.add(OptionsList(icon = Icons.Outlined.LocationOn, option = "New Ideas"))
        optionsList.add(OptionsList(icon = Icons.Outlined.PlayArrow, option = "Items History"))
        optionsList.add(OptionsList(icon = Icons.Outlined.AccountBox, option = "Shared Articles"))
        optionsList.add(
            OptionsList(
                icon = Icons.Outlined.Notifications,
                option = "Previous Notifications"
            )
        )
        optionsList.add(OptionsList(icon = Icons.Outlined.Favorite, option = "Verification Badge"))
        optionsList.add(OptionsList(icon = Icons.Outlined.DateRange, option = "Pending Tasks"))
        optionsList.add(OptionsList(icon = Icons.Outlined.ExitToApp, option = "FAQs"))
        optionsList.add(OptionsList(icon = Icons.Outlined.Home, option = "Support"))

        return optionsList
    }

    val optionsList = prepareOptionsList()
    Scaffold(
        topBar = { AppBar() },
        bottomBar = {
            AppBottomBar(
                navToHomeScreen = navToHomeScreen,
                navToSearchScreen = navToSearchScreen,
                navToProfileScreen = navToProfileScreen
            )
        }
    ) {

        val context = LocalContext.current

        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
            ) {
                Text(text = "Bienvenue sur BordelMc !")
                Text(text = "Ceci est une application où j'expérimente les bases de Compose tout comme les concepts un peu plus avancé !J'y apporte au fur et à mesure de nouvelles mise à jours que ce soit pour du contenu ou pour améliorer ce qui est en place. Au plaisir de vous voir utiliser l'app !  Alexandre")
                Spacer(modifier = Modifier.height(8.dp))
                CardItem()
                LazyRow(
                    horizontalArrangement = Arrangement.spacedBy(space = 12.dp),
                    contentPadding = PaddingValues(horizontal = 8.dp, vertical = 12.dp)
                ) {
                    items(optionsList) { item ->
                        CardImageItem(optionsList = item)
                    }
                }
                ButtonItem(
                    context = context,
                    onClick = {
                        Toast.makeText(context, "This is a Toast. Vay !", Toast.LENGTH_LONG).show()
                    },
                    text = "Toast !"
                )
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Subscribe")
                }
            }
        }
    }
}

@Preview
@Composable
fun HomeScreenPreview() {
    BordelMcTheme {
        HomeScreen(
            navToHomeScreen = { /*TODO*/ },
            navToProfileScreen = { /*TODO*/ },
            navToSearchScreen = { /*TODO*/ }
        )
    }
}