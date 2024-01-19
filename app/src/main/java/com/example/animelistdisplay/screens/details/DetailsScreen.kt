package com.example.animelistdisplay.screens.details

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.rememberAsyncImagePainter
import com.example.animelistdisplay.model.Anime
import com.example.animelistdisplay.model.getAnime
import com.example.animelistdisplay.widgets.AnimeRow

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailsScreen(navController: NavController, animeId: String?) {

    val newAnimeList = getAnime().filter { anime ->
        anime.id == animeId
    }
    Scaffold(topBar = {
        TopAppBar(
            colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = Color.Cyan),
            title = {

                Row(horizontalArrangement = Arrangement.Start) {
                    Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Back Arrow",
                        modifier = Modifier.clickable {
                            navController.popBackStack()
                        })
                    
                    Spacer(modifier = Modifier.width(100.dp))
                    Text("Anime",
                        color = MaterialTheme.colorScheme.onBackground)

                }
            },
            modifier = Modifier.shadow(elevation = 5.dp))
    }) { paddingValues ->
        Surface(modifier = Modifier.padding(paddingValues)) {

            Surface(modifier = Modifier.fillMaxSize()) {

                Column(horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Top) {

                    AnimeRow(animeName = newAnimeList[0])
                    Spacer(modifier = Modifier.height(8.dp))
                    Divider()
                    Text(text = "Anime Images", style = MaterialTheme.typography.headlineSmall)
                    HorizontalImageScroll(newAnimeList)

                }
            }



        }

    }

}

@Composable
private fun HorizontalImageScroll(newAnimeList: List<Anime>) {
    LazyRow {
        items(newAnimeList[0].images) { image ->
            Card(
                modifier = Modifier
                    .padding(12.dp)
                    .size(240.dp),
                elevation = CardDefaults.cardElevation(5.dp)
            ) {
                Image(
                    painter = rememberAsyncImagePainter(model = image, contentScale = ContentScale.Crop),
                    contentDescription = "Anime Images", modifier = Modifier.size(240.dp)
                )

            }
        }
    }
}
