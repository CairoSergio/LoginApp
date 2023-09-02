package com.cairo.dayoneloginapp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.cairo.dayoneloginapp.R
import com.cairo.dayoneloginapp.ui.theme.Roboto

@Composable
fun InputBox(
    label: String,
    type: inputTypes = inputTypes.Default,
    placeHolder: String
) {
    var value by remember {
        mutableStateOf("")
    }

    Column(modifier = Modifier
        .fillMaxWidth()
        .background(Color(0xFFFFFFFF))) {
        Text(
            text = label,
            style = TextStyle(
                fontSize = 14.sp,
                fontFamily = Roboto.robotoFontFamily,
                fontWeight = FontWeight(500),
                color = Color(0xFF312E49),
            )
        )
        Spacer(modifier = Modifier.size(6.dp))
        if (type==inputTypes.Default){
            OutlinedTextField(
                value = value,
                onValueChange = {value = it},
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp),
                placeholder = {
                    Text(
                        text = placeHolder,
                        style = TextStyle(
                            fontSize = 12.sp,
                            fontFamily = Roboto.robotoFontFamily,
                            fontWeight = FontWeight(500),
                            color = Color(0xFF747980),
                        ),
                        modifier = Modifier.fillMaxSize()
                    )
                }
            )
        }else if (type == inputTypes.PassWord){
            OutlinedTextField(
                value = value,
                onValueChange = {value = it},

                leadingIcon = {
                    Icon(painter = painterResource(id = R.drawable.lock ), contentDescription = "pass Word", modifier = Modifier.size(18.dp))
                },
                trailingIcon = {
                    Icon(painter = painterResource(id = R.drawable.eye_off), contentDescription = null , modifier = Modifier.size(18.dp))
                } ,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp),
                placeholder = {
                    Text(
                        text = placeHolder,
                        style = TextStyle(
                            fontSize = 12.sp,
                            fontFamily = Roboto.robotoFontFamily,
                            fontWeight = FontWeight(500),
                            color = Color(0xFF747980),
                        ),
                        modifier = Modifier.fillMaxSize()
                    )
                }
            )
        }else if(type == inputTypes.Email){
            OutlinedTextField(
                value = value,
                onValueChange = {value = it},

                leadingIcon = {
                        Icon(painter = painterResource(id = R.drawable.mail ), contentDescription = "mail", modifier = Modifier.size(18.dp))
                },

                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp),
                placeholder = {
                    Text(
                        text = placeHolder,
                        style = TextStyle(
                            fontSize = 12.sp,
                            fontFamily = Roboto.robotoFontFamily,
                            fontWeight = FontWeight(500),
                            color = Color(0xFF747980),
                        ),
                        modifier = Modifier.fillMaxSize()
                    )
                }
            )
        }
    }
}

enum class inputTypes{
    Default,
    Email,
    PassWord
}

@Preview
@Composable
fun PrevewInputBox(){
    InputBox(label = "Email", type = inputTypes.Default, placeHolder = "Your Email")
}