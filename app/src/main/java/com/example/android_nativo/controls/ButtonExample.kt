// ButtonExample.kt
package com.example.android_nativo.controls

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.android_nativo.ui.theme.AndroidnativoTheme
import androidx.compose.ui.unit.dp

@Composable
fun ButtonExample() {
    Column(
        modifier = Modifier.padding(16.dp)
    ) {
        Button(
            onClick = {
                showToast("Button Clicked")
            },
            modifier = Modifier.padding(8.dp)
        ) {
            Text("Da clic")
        }
    }
}

fun showToast(message: String) {
    // Puedes implementar la lógica para mostrar un Toast aquí
}

@Preview(showBackground = true)
@Composable
fun ButtonExamplePreview() {
    AndroidnativoTheme {
        ButtonExample()
    }
}
