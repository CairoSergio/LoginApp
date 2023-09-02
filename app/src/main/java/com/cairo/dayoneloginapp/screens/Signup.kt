package com.cairo.dayoneloginapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import  com.cairo.dayoneloginapp.R
import com.cairo.dayoneloginapp.components.InputBox
import com.cairo.dayoneloginapp.components.inputTypes
import com.cairo.dayoneloginapp.ui.theme.Roboto


@Composable
fun Signup(navController: NavHostController){
    val text = buildAnnotatedString {
        append("By signing up you agree to our")
        withStyle(style = SpanStyle(fontWeight = FontWeight(500), color = Color(0xFF312E49))) {
            append(" Terms & Condition")
        }
        append(" and ")
        withStyle(style = SpanStyle(fontWeight = FontWeight(500), color = Color(0xFF312E49))) {
            append("Privacy Policy.*")
        }
    }
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(24.dp, 0.dp)
    ) {

        Column {
            Spacer(modifier = Modifier.height(10.dp))
            Image(painter = painterResource(id = R.drawable.arrow_left), contentDescription = null, modifier = Modifier
                .size(22.dp)
                .clickable { navController.popBackStack() })
            Spacer(modifier = Modifier.size(13.dp))
            Text(
                text = "Sign up",
                style = TextStyle(
                    fontSize = 28.sp,
                    fontFamily = Roboto.robotoFontFamily,
                    fontWeight = FontWeight(600),
                    color = Color(0xFF312E49),
                )
            )
            Spacer(modifier = Modifier.height(36.dp))
            InputBox(label = "First Name", placeHolder = "Your First Name")
            Spacer(modifier = Modifier.size(18.dp))
            InputBox(label = "Last Name", placeHolder = "Your Last Name")
            Spacer(modifier = Modifier.size(18.dp))
            InputBox(label = "E-mail", type = inputTypes.Email,placeHolder = "Your E-mail")
            Spacer(modifier = Modifier.size(18.dp))
            InputBox(label = "Password", type = inputTypes.PassWord, placeHolder = "Your Password")
            Spacer(modifier = Modifier.size(17.dp))
            Text(
                text = text,
                style = TextStyle(
                    fontSize = 14.sp,
                    fontFamily = Roboto.robotoFontFamily,
                    fontWeight = FontWeight(400),
                    color = Color(0xFF747980),
                )
            )
            Spacer(modifier = Modifier.height(60.dp))
            Button(
                onClick = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFB4AAF2)),
                    shape = RoundedCornerShape(size = 6.dp)
            ) {
                Text(
                    text = "Continue",
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontFamily = Roboto.robotoFontFamily,
                        fontWeight = FontWeight(600),
                        color = Color(0xFFFFFFFF),
                    )
                )
            }
            Spacer(modifier = Modifier.height(40.dp))
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Already signed up?  ",
                    style = TextStyle(
                        fontSize = 12.sp,
                        fontFamily = Roboto.robotoFontFamily,
                        fontWeight = FontWeight(500),
                        color = Color(0xFF747980),
                    )
                )
                Text(
                    text = "Login",
                    style = TextStyle(
                        fontSize = 12.sp,
                        fontFamily = Roboto.robotoFontFamily,
                        fontWeight = FontWeight(500),
                        color = Color(0xFFB4AAF2),
                    ),
                    modifier = Modifier.clickable { navController.navigate("Login") }
                )
            }
        }
    }

}

@Preview
@Composable
fun Preview(){
    val navController = rememberNavController()
    Signup(navController = navController)
}