package com.example.bordelmc.quote

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.bordelmc.designSystem.component.AppScaffold
import com.example.bordelmc.designSystem.component.bar.AppBar
import com.example.bordelmc.designSystem.component.bar.AppBottomBar
import com.example.bordelmc.quote.model.UiState
import com.example.compose.BordelMcTheme

/**QuotesRoutes(

) {

    QuotesScreen(
        navToHomeScreen = { /*TODO*/ },
        navToProfileScreen = { /*TODO*/ },
        navToSearchScreen = { /*TODO*/ },
        uiState =
    )
}*/

@Composable
fun QuotesScreen(
    navToHomeScreen: () -> Unit,
    navToNotesScreen: () -> Unit,
    uiState: UiState
) {
    AppScaffold(
        topBar = { AppBar() },
        bottomBar = {
            AppBottomBar(
                navToHomeScreen = navToHomeScreen,
                navToNotesScreen = navToNotesScreen,
            )
        }
    ) {
        Box(
            modifier = Modifier
                .padding(8.dp)
                .fillMaxSize()
        ) {
            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                contentPadding = PaddingValues(16.dp)
            ) {
                items(uiState.quotes!!) { quote ->
                    Column(
                        modifier = Modifier.fillMaxWidth(),
                    ) {
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(
                            modifier = Modifier.fillMaxWidth(),
                            text = quote.author,
                            style = TextStyle(
                                fontStyle = FontStyle.Italic,
                                fontSize = MaterialTheme.typography.labelSmall.fontSize,
                                textAlign = TextAlign.End
                            )
                        )
                        Text(
                            modifier = Modifier.fillMaxWidth(),
                            text = quote.quote
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        Divider()
                    }
                }

            }
        }
    }
}

@Preview
@Composable
fun QuotesScreenPreview() {
    BordelMcTheme {
        QuotesScreen(
            navToHomeScreen = {},
            navToNotesScreen = {},
            uiState = UiState()
        )
    }
}