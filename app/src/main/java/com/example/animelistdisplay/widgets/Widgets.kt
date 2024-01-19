package com.example.animelistdisplay.widgets

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter
import com.example.animelistdisplay.model.Anime
import com.example.animelistdisplay.model.getAnime

@Preview
@Composable
fun AnimeRow(animeName: Anime= getAnime()[0], onItemClick: (String) -> Unit = {}) {

    var expanded by remember {
        mutableStateOf(false)
    }

    Card(
        modifier = Modifier
            .padding(4.dp)
            .fillMaxWidth()
//            .height(130.dp)
            .clickable {
                onItemClick(animeName.id)
            },
        shape = RoundedCornerShape(corner = CornerSize(16.dp)),
        elevation = CardDefaults.cardElevation(6.dp)
    ) {

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start
        ) {

            Surface(
                modifier = Modifier
                    .padding(12.dp)
                    .size(100.dp),
                shape = RectangleShape,
                shadowElevation = 4.dp
            ) {
                Image(painter = rememberAsyncImagePainter(model = animeName.poster),
                    contentDescription = "Poster",)
            }

            Column(Modifier.padding(4.dp)) {

                Text(text = animeName.title,
                    style = MaterialTheme.typography.headlineSmall)
                Text(text = "Studio: ${animeName.studio}",
                    style = MaterialTheme.typography.bodyMedium)
                Text(text = "Released: ${animeName.year}",
                    style = MaterialTheme.typography.bodyMedium)

                AnimatedVisibility(visible = expanded) {

                    Column {
                        Text( buildAnnotatedString {
                            withStyle(style = SpanStyle(color = Color.DarkGray,
                                fontSize = 14.sp)) {
                                append("Synopsis: ")
                            }
                            withStyle(style = SpanStyle(color = Color.DarkGray,
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Bold)) {
                                append(animeName.synopsis)
                            }
                        }, modifier = Modifier.padding(top=6.dp, bottom = 6.dp,end = 6.dp))

                        Divider(Modifier.padding(3.dp))
                        Text(text = "Genre: ${animeName.genre}",
                            style = MaterialTheme.typography.bodyMedium)
                        Text(text = "Mangaka: ${animeName.mangaka}",
                            style = MaterialTheme.typography.bodyMedium)
                        Text(text = "VA: ${animeName.va}",
                            style = MaterialTheme.typography.bodyMedium)
                        Text(text = "Rating: ${animeName.rating}",
                            style = MaterialTheme.typography.bodyMedium)
                    }
                }



                Icon(imageVector = if (expanded) Icons.Default.KeyboardArrowUp else Icons.Default.KeyboardArrowDown,
                    contentDescription = "Down Arrow",
                    modifier = Modifier
                        .size(24.dp)
                        .clickable {
                            expanded = !expanded
                        },
                    tint = Color.DarkGray)
            }
        }
    }
}