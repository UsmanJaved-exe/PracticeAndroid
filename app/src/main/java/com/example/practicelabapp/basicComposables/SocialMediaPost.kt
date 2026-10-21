package com.example.practicelabapp.basicComposables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Repeat
import androidx.compose.material.icons.filled.Send
import androidx.compose.material.icons.outlined.BookmarkBorder
import androidx.compose.material.icons.rounded.ChatBubbleOutline
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.practicelabapp.R

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Instagram() {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
    )
    {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 12.dp, vertical = 8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(40.dp)
                    .background(
                        brush = Brush.sweepGradient(
                            colors = listOf(
                                Color.Yellow,
                                Color.Red,
                                Color.Magenta,
                                Color.Yellow
                            ),
                        ),
                        shape = CircleShape,
                    )
                    .padding(5.dp)
            ) {
                Image(
                    painter = painterResource(R.drawable.ic_launcher_foreground),
                    contentDescription = "null",
                    modifier = Modifier.clip(CircleShape)
                )
            }

            Spacer(modifier = Modifier.width(10.dp))

            Text(
                text = "Username",
                fontWeight = FontWeight.Bold,
                fontSize = 15.sp,
            )
            Spacer(modifier = Modifier.weight(1f))

            Icon(
                imageVector = Icons.Default.MoreVert,
                contentDescription = "Dot menu"
            )
        }


        Image(
            painter = painterResource(R.drawable.wallhavenqrow67),
            contentDescription = "Katana",
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 12.dp, vertical = 8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Icon(
                imageVector = Icons.Default.FavoriteBorder,
                contentDescription = "Favorite",
                modifier = Modifier.size(30.dp)
            )

            Spacer(modifier = Modifier.width(15.dp))


            Icon(
                imageVector = Icons.Rounded.ChatBubbleOutline,
                contentDescription = "Comment",
                modifier = Modifier.size(30.dp)
            )

            Spacer(modifier = Modifier.width(15.dp))

            Icon(
                imageVector = Icons.Default.Send,
                contentDescription = "Share",
                modifier = Modifier.size(30.dp)
            )

            Spacer(modifier = Modifier.width(15.dp))

            Icon(
                imageVector = Icons.Default.Repeat,
                contentDescription = "Repost",
                modifier = Modifier.size(30.dp)
            )

            Spacer(modifier = Modifier.weight(1f))

            Icon(
                imageVector = Icons.Outlined.BookmarkBorder,
                contentDescription = "Save",
                modifier = Modifier.size(30.dp)
            )
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(horizontal = 12.dp, vertical = 8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Username",
                fontWeight = FontWeight.Bold,
                fontSize = 15.sp,
            )

            Spacer(modifier = Modifier.width(15.dp))

            Text(
                text = "Lorem ipsum dolor sit amet",
                fontSize = 15.sp,
            )
        }
        Text(
            text = "5 DAYS AGO",
            fontSize = 10.sp,
            fontWeight = FontWeight.Light,
            modifier = Modifier.padding(horizontal = 12.dp)
        )
    }
}
