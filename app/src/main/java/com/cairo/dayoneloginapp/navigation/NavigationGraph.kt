package com.cairo.dayoneloginapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.cairo.dayoneloginapp.screens.Login
import com.cairo.dayoneloginapp.screens.Signup

@Composable
fun NavigationGraph() {
    val navController = rememberNavController()
    
    NavHost(navController = navController, startDestination = "Login"){
        composable(route = "Signup"){
            Signup(navController = navController)
        }
        composable(route = "Login"){
            Login(navController = navController)
        }
    }

}