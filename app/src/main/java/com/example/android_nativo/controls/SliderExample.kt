// SliderExample.kt
package com.example.android_nativo.controls

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Slider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.*

@Composable
fun SliderExample() {
    var sliderValue by remember { mutableStateOf(0f) }

    Column(
        modifier = Modifier.padding(16.dp)
    ) {
        Slider(
            value = sliderValue,
            onValueChange = {
                sliderValue = it
                showSliderValue(it)
            },
            modifier = Modifier.padding(8.dp)
        )
    }
}

fun showSliderValue(value: Float) {
    // implementar la lógica para mostrar un mensaje relacionado con el slider
}
