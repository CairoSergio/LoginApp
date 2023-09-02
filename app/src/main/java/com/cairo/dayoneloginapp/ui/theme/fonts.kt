package com.cairo.dayoneloginapp.ui.theme

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.cairo.dayoneloginapp.R

object  Roboto {
    val robotoFontFamily = FontFamily(
        Font(R.font.roboto_bold, FontWeight.Bold),
        Font(R.font.roboto_black, FontWeight.Black),
        Font(R.font.roboto_light, FontWeight.Light),
        Font(R.font.roboto_regular, FontWeight.Normal),
        Font(R.font.roboto_medium, FontWeight.Medium),
        Font(R.font.roboto_thin, FontWeight.Thin)
    )

    val bold = TextStyle(
        fontFamily = robotoFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 16.sp
    )

    val black = TextStyle(
        fontFamily = robotoFontFamily,
        fontWeight = FontWeight.Black,
        fontSize = 16.sp
    )

    val light = TextStyle(
        fontFamily = robotoFontFamily,
        fontWeight = FontWeight.Light,
        fontSize = 16.sp
    )

    val regular = TextStyle(
        fontFamily = robotoFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    )

    val medium = TextStyle(
        fontFamily = robotoFontFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 16.sp
    )

    val thin = TextStyle(
        fontFamily = robotoFontFamily,
        fontWeight = FontWeight.Thin,
        fontSize = 16.sp
    )
}
