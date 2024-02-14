// ImageButtonExample.kt
package com.example.android_nativo.controls

import android.os.Handler
import android.os.Looper
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.android_nativo.R
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun ImageButtonExample() {
    var isLoading by remember { mutableStateOf(false) }
    var imageLoaded by remember { mutableStateOf(false) }
    val context = LocalContext.current

    Column(
        modifier = Modifier.padding(16.dp),
        verticalArrangement = Arrangement.Center
    ) {
        // Display the loading indicator or image
        if (isLoading) {
            CircularProgressIndicator(
                modifier = Modifier
                    .size(50.dp)
                    .padding(8.dp)
            )
        } else {
            // Display the image or button
            if (imageLoaded) {
                Image(
                    painter = painterResource(id = R.drawable.ic_launcher_foreground),
                    contentDescription = "Loaded Image",
                    modifier = Modifier
                        .size(150.dp)
                        .clip(CircleShape)
                        .background(MaterialTheme.colorScheme.primary)
                        .padding(8.dp),
                    contentScale = ContentScale.Crop
                )
            } else {
                Button(
                    onClick = {
                        // Simulate loading by setting isLoading to true
                        isLoading = true

                        // Perform asynchronous operation (e.g., loading an image)
                        // Replace the following delay with your actual asynchronous operation
                        val handler = Handler(Looper.getMainLooper())
                        handler.postDelayed({
                            // Load image after delay
                            imageLoaded = true
                            isLoading = false
                        }, 2000)
                    },
                    modifier = Modifier.padding(8.dp)
                ) {
                    Spacer(modifier = Modifier.width(8.dp))
                    Text("Mostrar Imagen")
                }
            }
        }
    }
}
