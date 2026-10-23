package com.example.practicelabapp.restaurantMenuUI

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

//@Preview(showSystemUi = true, showBackground = true)
@Composable
fun MenuItemCard(item: DummyItem) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(),
        shape = RoundedCornerShape(15.dp)
    ) {
        Row(
            modifier = Modifier
                .padding(12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(item.imageID),
                contentDescription = "null",
                modifier = Modifier
                    .size(150.dp)
            )

            Spacer(modifier = Modifier.width(15.dp))

            Box(
                modifier = Modifier
                    .padding()
                    .height(150.dp)
                    .fillMaxWidth()
            ) {
                Text(
                    text = item.name,
                    color = Color.Gray,
                    modifier = Modifier
                        .align(Alignment.TopStart)
                )

                Text(
                    text = item.currency,
                    color = Color.Black,
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .align(Alignment.CenterStart)
                        .offset(0.dp, (-20).dp)
                )

                Button(
                    onClick = {},
                    modifier = Modifier
                        .align(Alignment.BottomStart)
                        .height(50.dp),
                    colors = ButtonDefaults.buttonColors(Color.Black, Color.White),
                    elevation = ButtonDefaults.buttonElevation(10.dp)
                ) {
                    Text(
                        text = "Order Now",
                        fontSize = 16.sp
                    )


                }
                Text(
                    text = item.category,
                    color = Color(0xCBFF5722),
                    fontSize = 10.sp,
                    modifier = Modifier
                    .align(Alignment.TopEnd)
                )
            }
        }
    }
}