package com.example.bordelmc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.bordelmc.ui.home.HomeScreen
import com.example.bordelmc.ui.home.HomeViewModel
import com.example.bordelmc.ui.theme.BordelMcTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BordelMcTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val viewModel : HomeViewModel = hiltViewModel()
                    HomeScreen(
                        onGetQuotes = { viewModel.getQuotes() },
                        uiState = viewModel.uiState.value
                    )
                }
            }
        }
    }
}
