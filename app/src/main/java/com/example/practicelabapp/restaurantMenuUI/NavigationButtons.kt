package com.example.practicelabapp.restaurantMenuUI

import android.R.attr.onClick
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.SelectableChipElevation
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import java.util.logging.Filter


@Composable
fun NaviButtons(
    text: String,
    selected: Boolean,
) {
    FilterChip(
        selected = selected,
        onClick = {},
        label = {
            Text(text)
        },
        colors = FilterChipDefaults.filterChipColors(
            selectedContainerColor = Color.Black,
            selectedLabelColor = Color.White
        ),
        shape = RoundedCornerShape(50.dp),
        elevation = FilterChipDefaults.filterChipElevation(10.dp)
    )
}