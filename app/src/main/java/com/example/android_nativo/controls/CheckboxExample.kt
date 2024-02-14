// CheckboxExample.kt
package com.example.android_nativo.controls

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Checkbox
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.rememberUpdatedState

@Composable
fun CheckboxExample() {
    val context = LocalContext.current
    var checkedState by remember { androidx.compose.runtime.mutableStateOf(false) }
    val showToast = rememberUpdatedState(checkedState)

    Column(
        modifier = Modifier.padding(16.dp)
    ) {
        Checkbox(
            checked = checkedState,
            onCheckedChange = {
                checkedState = it
                showCheckboxMessage(context, it)
            },
            modifier = Modifier.padding(8.dp)
        )
    }
}

fun showCheckboxMessage(context: Context, checked: Boolean) {
    val message = if (checked) "Checkbox Checked" else "Checkbox Unchecked"
    Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
}
