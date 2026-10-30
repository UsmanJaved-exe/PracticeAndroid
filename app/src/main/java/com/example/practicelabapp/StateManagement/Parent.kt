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
    var totalPrice by rememberSaveable { mutableIntStateOf(1200) }
    var count by rememberSaveable { mutableIntStateOf(0) }
    var quantity by rememberSaveable { mutableIntStateOf(1) }


    val onIncrement: () -> Unit = { count++ }
    val onDecrement: () -> Unit = { count-- }
    val onReset = { count = 0 }

    val price = 1200
    val onAdd = {
        quantity++
        totalPrice = price * quantity
    }

    val reset = {
        totalPrice = 1200;
        quantity = 1;
    }

    PizzaPriceCalculator(onAdd, reset, count,totalPrice,quantity)
//    Count(onIncrement, onDecrement, onReset, count)

}
