package com.example.practicelabapp.restaurantMenuUI

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.outlined.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.OutlinedIconButton
import androidx.compose.material3.SegmentedButtonDefaults.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TopBarUi() {
    CenterAlignedTopAppBar(
        title = {
            Text(
                text = "Pizza Mojo",
                fontSize = 25.sp,
            )
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color.Black,
            titleContentColor = Color.White
        ),
        navigationIcon = {
            OutlinedIconButton(
                onClick = {},
                shape = CircleShape,
                modifier = Modifier
                    .size(50.dp)
//                    .border(BorderStroke(2.dp, Color(0xFFCFCACA)), CircleShape)


            ) {
                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    tint = Color(0xFFCFCACA),
                    contentDescription = "Back",
                )
            }
        },

        actions = {
            OutlinedIconButton(
                onClick = {},
                shape = CircleShape,
                modifier = Modifier
                    .size(50.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.MoreVert,
                    tint = Color(0xFFCFCACA),
                    contentDescription = "More",
                )
            }
        }
    )
}