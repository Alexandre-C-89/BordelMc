package com.example.bordelmc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.bordelmc.navigation.AppNavHost
import com.example.bordelmc.designSystem.theme.BordelMcTheme
import com.example.bordelmc.search.SearchScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val viewModel: MainViewModel = hiltViewModel()
            BordelMcTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    //AppNavHost()
                    SearchScreen(
                        onGetQuotes = { viewModel.getQuotes() },
                        uiState = viewModel.uiState.value
                    )
                }
            }
        }
    }
}