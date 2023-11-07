package com.example.buttonnavapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.buttonnavapp.ui.theme.screens.buttonnav.BottomAppBarWithScaffold
import com.example.buttonnavapp.ui.theme.screens.buttonnav.ButtonNavScreen
import com.example.buttonnavapp.ui.theme.screens.splash.SplashScreen

@Composable
fun AppNavHost(modifier: Modifier=Modifier, navController: NavHostController= rememberNavController(),
startDestination: String= ROUTE_SPLASH) {

    NavHost(navController = navController, modifier = modifier, startDestination = startDestination ){

        composable(ROUTE_SPLASH){
            SplashScreen(navController)
        }
        composable(ROUTE_BUTTON){
            BottomAppBarWithScaffold(navController)
        }
        composable(ROUTE_BOTTOM){
            ButtonNavScreen(navController)
        }
    }

}