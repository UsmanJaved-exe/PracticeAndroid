package com.example.practicelabapp.StateManagement

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun PizzaPriceCalculator(onAdd: () -> Unit, reset: () -> Unit, count: Int, totalPrice: Int, quantity: Int) {
    Column(
        modifier = Modifier
            .padding(15.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Button(
            onClick = {onAdd()},
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Text(
                text = "Add +1",
            )
        }

        Button(
            onClick = {reset()},
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Text(
                text = "Reset",
            )
        }

        Text(
            text = "Pizza Price: $totalPrice",
            fontWeight = FontWeight.Bold,
            fontSize = 26.sp
        )
    }
}