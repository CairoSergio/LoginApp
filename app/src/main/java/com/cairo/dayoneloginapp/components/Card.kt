package com.cairo.dayoneloginapp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.BiasAlignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.cairo.dayoneloginapp.R


@Composable
fun CardModel(
    imagem: Int
){
    Box(modifier = Modifier
        .width(72.dp)
        .height(68.dp)
        .clickable {  }
        .background(color = Color.White, shape = RoundedCornerShape(size = 6.dp))
        .border(
            width = 1.dp,
            color = Color(0xFFEBE9F1),
            shape = RoundedCornerShape(size = 6.dp)
        ),
        contentAlignment = BiasAlignment(0f,0f)
    ) {
        Image(painter = painterResource(id = imagem), contentDescription = null, modifier = Modifier.size(36.dp))
    }
}