package com.example.practicelabapp.restaurantMenuUI

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.outlined.LocationOn
import androidx.compose.material.icons.outlined.Timer
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.practicelabapp.R

//@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ScaffoldShow(
    selectedFilterChip: String,
    menuItems1: List<DummyItem>,
    categories1: List<String>,
    onFilterChipClick: (String) -> Unit,
) {




    Scaffold(
        topBar = {
            TopBarUi()
        }
    ) { innerPadding ->

        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(350.dp)
                    .background(Color.Black)
//                    .padding(innerPadding)
            ) {
                Column(
                    modifier = Modifier
                        .padding(innerPadding)
                ) {
                    Text(
                        text = "Your Favourite neighbourhood pizza place serving fresh, cheesy, handcrafted pizza's with premium ingredients.",
                        fontSize = 15.sp,
                        color = Color.LightGray
                    )

                    Spacer(modifier = Modifier.height(30.dp))

                    Row(
                        horizontalArrangement = Arrangement.spacedBy(12.dp),
                    ) {
                        InfoPill(Icons.Outlined.Timer, "30-45 min", "Delivery Time", Color.Black)
                        InfoPill(Icons.Filled.Star, "4.9 (21k)", "Rating", Color(0xFFFF5722))
                    }

                    Spacer(modifier = Modifier.height(10.dp))

                    Row {
                        InfoPill(Icons.Outlined.LocationOn, "1.5 km", "Distance", Color.Black)
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    Text(
                        text = "11:00 AM - 10:30 PM",
                        color = Color.LightGray,
                        fontSize = 15.sp
                    )
                }

                Image(
                    painter = painterResource(R.drawable.img_2),
                    contentDescription = "Pizza",
                    modifier = Modifier
                        .align(Alignment.BottomEnd)
                        .size(280.dp)
                        .offset(60.dp, 85.dp)
                )

                Box(
                    modifier = Modifier
                        .align(Alignment.BottomCenter)
                        .offset(y = 85.dp)
//                    .padding(innerPadding)
                        .fillMaxWidth()
                        .fillMaxHeight(0.45f)
                        .clip(CurveShape)
                        .background(Color.White),
                    contentAlignment = Alignment.Center
                ) {
                    LazyRow(
                        modifier = Modifier
                            .fillMaxWidth()
                            .align(Alignment.BottomCenter)
                            .padding(bottom = 20.dp),
                        contentPadding = PaddingValues(horizontal = 16.dp),
                        horizontalArrangement = Arrangement.spacedBy(12.dp),
                        userScrollEnabled = true,
                    ) {
                        items(categories1) { category ->
                            FilterChipExample(
                                selectedFilterChip,
                                category,
                                onFilterChipClick
                            )

                        }
                    }
                }


            }
            Spacer(modifier = Modifier.height(85.dp))

            LazyColumn(
                modifier = Modifier
                    .fillMaxSize(),
                userScrollEnabled = true,
                verticalArrangement = Arrangement.spacedBy(16.dp)
            )
            {
                items(
                    items = menuItems1,
                    key = { item -> item.name }
                ) { item ->
                    MenuItemCard(item = item)
                }
            }
        }
    }
}
