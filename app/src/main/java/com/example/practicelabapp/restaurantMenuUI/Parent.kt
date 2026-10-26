package com.example.practicelabapp.restaurantMenuUI

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import com.example.practicelabapp.R

@Preview
@Composable
fun Parent() {
    var selectedFilterChip by rememberSaveable { mutableStateOf("All") }

    val categories = listOf(
        "All", "Classic Pizzas", "Popular Pizzas", "Special Pizzas", "Deals", "New", "Beverages"
    )

    val menuItems = listOf(
        DummyItem(
            "BBQ Chicken Pizza",
            "Classic Pizzas",
            R.drawable.bbq,
            "Rs",
            1500
        ),
        DummyItem(
            "Margherita Pizza",
            "Classic Pizzas",
            R.drawable.margherita,
            "Rs",
            1200
        ),

        DummyItem(
            "Pepperoni Pizza",
            "Popular Pizzas",
            R.drawable.pepperoni,
            "Rs",
            1300
        ),

        DummyItem(
            "Hawaiian Pizza",
            "Special Pizzas",
            R.drawable.hawaiian,
            "Rs",
            1400
        ),

        DummyItem(
            "Vegetarian Pizza",
            "Deals",
            R.drawable.vegetarian,
            "Rs",
            1100
        ),


        DummyItem(
            "Meat Lovers Pizza",
            "Special Pizzas",
            R.drawable.meatlover,
            "Rs",
            1600
        ),

        DummyItem(
            "Seafood Pizza",
            "Special Pizzas",
            R.drawable.sea,
            "Rs",
            1700
        ),

        DummyItem(
            "Coca-Cola",
            "Beverages",
            R.drawable.cocacola,
            "Rs",
            200
        ),

        DummyItem(
            "Sprite",
            "Beverages",
            R.drawable.sprite,
            "Rs",
            200
        ),

        DummyItem(
            "Fanta",
            "Beverages",
            R.drawable.fanta,
            "Rs",
            200
        ),

        DummyItem(
            "Mountain Dew",
            "Beverages",
            R.drawable.mountaindew,
            "Rs",
            200
        ),

        DummyItem(
            "7up",
            "Beverages",
            R.drawable.sevenup,
            "Rs",
            200
        ),

        DummyItem(
            "Pepsi",
            "Beverages",
            R.drawable.pepsi,
            "Rs",
            200
        ),

        DummyItem(
            "Miranda",
            "Beverages",
            R.drawable.mirinda,
            "Rs",
            200
        ),


        DummyItem(
            "Chicken Fajita",
            "Classic Pizzas",
            R.drawable.fajita,
            "Rs",
            1500
        )
    )

    val onFilterChipClick: (String) -> Unit = { clickedCategory ->
        selectedFilterChip = clickedCategory
    }


    ScaffoldShow(selectedFilterChip, menuItems, categories,onFilterChipClick)
}