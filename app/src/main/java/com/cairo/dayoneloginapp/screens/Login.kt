package com.cairo.dayoneloginapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.BiasAlignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.cairo.dayoneloginapp.R
import com.cairo.dayoneloginapp.components.CardModel
import com.cairo.dayoneloginapp.components.InputBox
import com.cairo.dayoneloginapp.components.inputTypes
import com.cairo.dayoneloginapp.ui.theme.Roboto


@Composable
fun Login(navController: NavHostController){
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(24.dp, 0.dp)
    ) {
        var remember by remember {
            mutableStateOf(false)
        }

        Column(modifier = Modifier.fillMaxSize()) {
            Text(
                modifier = Modifier.padding(top = 80.dp),
                text = "Login",
                fontSize = 28.sp,
                fontFamily = Roboto.robotoFontFamily,
                color = Color(0xFF312E49),
                fontWeight = FontWeight(600),
            )
            Spacer(modifier = Modifier.size(16.dp))
            InputBox(label = "E-mail", type = inputTypes.Email, placeHolder = "Your Email")
            Spacer(modifier = Modifier.size(18.dp))
            InputBox(label = "Password", type = inputTypes.PassWord , placeHolder = "Your Password")
            Spacer(modifier = Modifier.size(18.dp))
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                Row(horizontalArrangement = Arrangement.Center){
                    Checkbox(checked = remember, onCheckedChange = {remember = !remember}, modifier = Modifier
                        .size(16.dp)
                        .padding(start = 5.dp))
                    Text(
                        modifier = Modifier.padding(start = 13.dp),
                        text = "Remember Me",
                        style = TextStyle(
                            fontSize = 12.sp,
                            fontFamily = Roboto.robotoFontFamily,
                            fontWeight = FontWeight(500),
                            color = Color(0xFF747980),
                        )
                    )
                }
                Text(
                    text = "Forgot Password?",
                    style = TextStyle(
                        fontSize = 12.sp,
                        fontFamily = Roboto.robotoFontFamily,
                        fontWeight = FontWeight(500),
                        color = Color(0xFFB4AAF2),
                    ),
                )

            }
            Spacer(modifier = Modifier.padding(top = 60.dp))
            Button(
                onClick = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFB4AAF2)),
                shape = RoundedCornerShape(size = 6.dp)
            ) {
                Text(
                    text = "Login",
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontFamily = Roboto.robotoFontFamily,
                        fontWeight = FontWeight(600),
                        color = Color(0xFFFFFFFF),
                    )
                )
            }
            Spacer(modifier = Modifier.height(50.dp))
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment =Alignment.CenterVertically
                ) {
                    Box(modifier = Modifier
                        .background(color = Color(0xFFCDCED1))
                        .weight(1f)
                        .height(1.dp))
                    Text(
                        text = "or continue with",
                        style = TextStyle(
                            fontSize = 14.sp,
                            fontFamily = Roboto.robotoFontFamily,
                            fontWeight = FontWeight(400),
                            color = Color(0xFF747980),
                            textAlign = TextAlign.Center,
                        ),
                        modifier = Modifier.padding(horizontal = 8.dp)
                    )
                    Box(modifier = Modifier
                        .background(color = Color(0xFFCDCED1))
                        .weight(1f)
                        .height(1.dp))
                }
            Spacer(modifier = Modifier.height(20.dp))
            Row(modifier =  Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
                CardModel(imagem = R.drawable.facebook)
                CardModel(imagem = R.drawable.google)
                CardModel(imagem = R.drawable.linkedin)
            }
            Spacer(modifier = Modifier.height(40.dp))
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Don,t have an account?  ",
                    style = TextStyle(
                        fontSize = 12.sp,
                        fontFamily = Roboto.robotoFontFamily,
                        fontWeight = FontWeight(500),
                        color = Color(0xFF747980),
                    )
                )
                Text(
                    text = "SignUp",
                    style = TextStyle(
                        fontSize = 12.sp,
                        fontFamily = Roboto.robotoFontFamily,
                        fontWeight = FontWeight(500),
                        color = Color(0xFFB4AAF2),
                    ),
                    modifier = Modifier.clickable { navController.navigate("Signup") }
                )
            }
        }

    }

}


@Preview()
@Composable
fun PreViewLogin(){
    val navController = rememberNavController()
    Login(navController = navController)
}