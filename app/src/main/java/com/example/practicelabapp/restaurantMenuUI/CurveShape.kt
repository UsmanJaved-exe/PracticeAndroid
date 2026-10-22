package com.example.practicelabapp.restaurantMenuUI

import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.LayoutDirection

val CurveShape = object : Shape {
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        val path = Path().apply {
            // 1. Start at the bottom left
            moveTo(0f, size.height)
            // 2. Go straight up to the left edge
            lineTo(0f, 200f) // 150f is how far down the curve starts
            // 3. Draw the curve (Control point at the top center, ends at right edge)
            quadraticBezierTo(
                x1 = size.width / 2f,
                y1 = 0f,
                x2 = size.width,
                y2 = 200f
            )
            // 4. Go down to the bottom right
            lineTo(size.width, size.height)
            // 5. Close the shape
            close()
        }
        return Outline.Generic(path)
    }
}