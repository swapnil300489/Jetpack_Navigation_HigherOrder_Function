package com.example.navigation_higherorder_function.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.navigation_higherorder_function.ui.screens.DetailScreen
import com.example.navigation_higherorder_function.ui.screens.HomeScreen

@Composable
fun AppNavGraph(navController: NavHostController){
    NavHost(navController = navController, startDestination = "home") {
        composable("home") {
            HomeScreen(onNavigateToDetail = {
                navController.navigate("detail")
            })
        }
        composable("detail") {
            DetailScreen()
        }
    }
}