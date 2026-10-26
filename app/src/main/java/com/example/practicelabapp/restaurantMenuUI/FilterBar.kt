package com.example.practicelabapp.restaurantMenuUI

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun FilterChipExample(
    selectedFilterChip: String,
    category: String,
    onFilterChipClick: (String) -> Unit,
) {

    FilterChip(
        selected = (category == selectedFilterChip),
        onClick = { onFilterChipClick(category)},
        label = {
            Text(category)
        },
        colors = FilterChipDefaults.filterChipColors(
            selectedContainerColor = Color.Black,
            selectedLabelColor = Color.White
        ),
        shape = RoundedCornerShape(50.dp),
        elevation = FilterChipDefaults.filterChipElevation(10.dp)
    )
}


