package com.example.practicelabapp.StateManagement

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun Master() {
    var price by rememberSaveable { mutableIntStateOf(0) }
    var count by rememberSaveable { mutableIntStateOf(0) }
    val pizzaPrice = 1200

    val onIncrement: () -> Unit = { count++ }
    val onDecrement: () -> Unit = { count-- }
    val onReset = { count = 0 }

    val onAdd = {
        price * pizzaPrice
    }

    val reset = {
        price = 0
    }

    PizzaPriceCalculator(onAdd(), reset, count)
    Count(onIncrement, onDecrement, onReset, count)

}
