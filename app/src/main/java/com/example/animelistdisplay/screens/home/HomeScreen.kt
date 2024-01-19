package com.example.animelistdisplay.screens.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.animelistdisplay.model.Anime
import com.example.animelistdisplay.model.getAnime
import com.example.animelistdisplay.navigation.AnimeScreens
import com.example.animelistdisplay.widgets.AnimeRow

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController) {
    Scaffold(topBar = {
        TopAppBar(
            colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = Color.Cyan),
            title = {
                Text("Anime")
            },
            modifier = Modifier.shadow(elevation = 5.dp)
        )
    }) { paddingValues ->
        Surface(modifier = Modifier.padding(paddingValues)) {
            MainContent(navController = navController)
        }
    }
}

@Composable
fun MainContent(
    navController: NavController,
    animeList: List<Anime> = getAnime()
) {
    Column(modifier = Modifier.padding(12.dp)) {
        LazyColumn {
            items(items = animeList) {

                AnimeRow(animeName = it) { anime ->
                    navController.navigate(route = AnimeScreens.DetailsScreen.name + "/$anime")

                }
            }
        }
    }
}