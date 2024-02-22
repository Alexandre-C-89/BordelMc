package com.example.bordelmc.sign_in

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bordelmc.designSystem.component.AppScaffold
import com.example.compose.BordelMcTheme
import com.plcoding.composegooglesignincleanarchitecture.presentation.sign_in.SignInState

@Composable
fun SignInScreen(
    state: SignInState,
    onSignInClick: () -> Unit
) {
    val context = LocalContext.current
    LaunchedEffect(key1 = state.signInError) {
        state.signInError?.let { error ->
            Toast.makeText(
                context,
                error,
                Toast.LENGTH_LONG
            ).show()
        }
    }

    AppScaffold(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "'Welcome to the app'", fontSize = 24.sp)
            Text(text = "Clémençot Alexandre", fontSize = 12.sp, fontStyle = FontStyle.Italic)
            Spacer(modifier = Modifier.height(30.dp))
            Text(
                textAlign = TextAlign.Center,
                text = "Please click and connect with your account of google or email and password",
                fontSize = 14.sp
            )
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = onSignInClick) {
                Text(text = "Sign in")
            }
        }
    }
}

@Preview
@Composable
fun SignInScreenPreview() {
    BordelMcTheme {
        SignInScreen(
            state = SignInState(),
            onSignInClick = {}
        )
    }
}