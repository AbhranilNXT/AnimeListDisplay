package com.example.animelistdisplay.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.animelistdisplay.screens.details.DetailsScreen
import com.example.animelistdisplay.screens.home.HomeScreen

@Composable
fun AnimeNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController ,
        startDestination = AnimeScreens.HomeScreen.name) {

        composable(AnimeScreens.HomeScreen.name) {
            HomeScreen(navController = navController)
        }

        composable(AnimeScreens.DetailsScreen.name + "/{anime}",
            arguments = listOf(navArgument(name = "anime") {type = NavType.StringType})
        ) {
            backStackEntry ->

            DetailsScreen(navController = navController,
                backStackEntry.arguments?.getString("anime"))
        }
    }
}