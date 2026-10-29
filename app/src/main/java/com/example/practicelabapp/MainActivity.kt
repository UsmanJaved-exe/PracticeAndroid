package com.example.practicelabapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.practicelabapp.StateManagement.Master
import com.example.practicelabapp.restaurantMenuUI.Parent
import com.example.practicelabapp.ui.theme.PracticeLabAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PracticeLabAppTheme {
                Master()
            }
        }
    }
}
