package com.example.bordelmc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import com.example.bordelmc.navigation.AppNavHost
import com.example.compose.BordelMcTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BordelMcTheme {
                Surface{
                    AppNavHost()
                }
            }
        }
    }
}