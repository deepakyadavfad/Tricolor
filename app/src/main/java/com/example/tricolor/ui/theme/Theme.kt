package com.example.tricolor.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable



private val LightColorPalette = lightColors(
    primary = Purple500 ,
    primaryVariant = Purple700 ,
    secondary = Teal200

    /* Other default colors to override
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    */
)

@Composable
fun TricolorTheme(darkTheme : Boolean = isSystemInDarkTheme() , content : @Composable () -> Unit) {
    val colors =


        LightColorPalette


    MaterialTheme(
        colors = colors ,
        typography = Typography ,
        shapes = Shapes ,
        content = content
    )
}