package com.example.animelistdisplay.navigation

enum class AnimeScreens {
    HomeScreen,
    DetailsScreen;
    companion object {
        fun fromRoute(route : String?): AnimeScreens
        = when (route?.substringBefore("/")) {
            HomeScreen.name -> HomeScreen
            DetailsScreen.name -> DetailsScreen
            null -> HomeScreen
            else -> throw IllegalArgumentException("Route $route not recognized")
        }
    }
}