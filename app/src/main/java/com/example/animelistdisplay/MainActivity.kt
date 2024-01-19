package com.example.animelistdisplay

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.animelistdisplay.navigation.AnimeNavigation
import com.example.animelistdisplay.ui.theme.AnimeListDisplayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp {
                AnimeNavigation()
            }
        }
    }
}

@Composable
fun MyApp(content: @Composable () -> Unit) {
    AnimeListDisplayTheme {
        content()
    }
}







@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApp {
        AnimeNavigation()
    }
}