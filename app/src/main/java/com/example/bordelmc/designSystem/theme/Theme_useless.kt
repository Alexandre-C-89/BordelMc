package com.example.bordelmc.designSystem.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(
    primary = Yellow,
    primaryVariant = LightBlue,
    secondary = Orange,
    background = ExtraLightOrange,
    surface = Grey,
    onPrimary = Yellow,
    onSecondary = Orange,
    onBackground = DarkBlue,
    onSurface = ExtraLightBlue,
)

private val LightColorPalette = lightColors(
    primary = Yellow,
    primaryVariant = DarkBlue,
    secondary = DarkOrange,
    background = ExtraLightOrange,
    surface = Grey,
    onPrimary = Yellow,
    onSecondary = Orange,
    onBackground = DarkBlue,
    onSurface = ExtraLightBlue,
)

@Composable
fun BordelMcThemeUseless(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        //typography = alexTypography,
        shapes = Shapes,
        content = content
    )
}