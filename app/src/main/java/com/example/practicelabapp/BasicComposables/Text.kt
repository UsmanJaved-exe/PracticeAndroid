package com.example.practicelabapp.BasicComposables

import android.R.attr.value
import android.content.Context
import android.graphics.Outline
import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.fontResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewText() {
    var name by rememberSaveable { mutableStateOf("") }
    var password by rememberSaveable { mutableStateOf("") }


    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Hello Usman!",
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Cursive,
            fontStyle = FontStyle.Italic,
        )

        Spacer(modifier = Modifier.padding(10.dp))

        OutlinedTextField(
            value = name,
            onValueChange = { name = it },
            singleLine = true,
            placeholder = {
                Text(
                    text = "Enter your name",
                    fontSize = 26.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.Cursive,
                    fontStyle = FontStyle.Italic,
                )
            }
        )

        Spacer(modifier = Modifier.padding(5.dp))

        OutlinedTextField(
            value = password,
            singleLine = true,
            onValueChange = { password = it },
            placeholder = {
                Text(
                    text = "Enter your Password",
                    fontSize = 26.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.Cursive,
                    fontStyle = FontStyle.Italic,
                )
            }
        )

        Spacer(modifier = Modifier.padding(10.dp))

        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(Color(0xFF6E0735)),

        ) {
            Text(
                text = "Login",
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Cursive,
                fontStyle = FontStyle.Italic,
                fontSize = 16.sp
            )
        }
    }
}

