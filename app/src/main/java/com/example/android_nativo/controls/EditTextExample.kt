// EditTextExample.kt
package com.example.android_nativo.controls

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.*

@Composable
fun EditTextExample() {
    var text by remember { mutableStateOf("Escribe algo...") }

    Column(
        modifier = Modifier.padding(16.dp)
    ) {
        BasicTextField(
            value = text,
            onValueChange = {
                text = it
            },
            singleLine = true,
            keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Text),
            textStyle = LocalTextStyle.current.copy(color = Color.Black),
            modifier = Modifier.padding(8.dp)
        )

    }
}
