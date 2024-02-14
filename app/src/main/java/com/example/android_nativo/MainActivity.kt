package com.example.android_nativo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.android_nativo.ui.theme.AndroidnativoTheme


import com.example.android_nativo.controls.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidnativoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    // Content of the screen
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        content = {
                            Greeting("Android")
                            CheckboxExample()
                            SliderExample()
                            EditTextExample()
                            ButtonExample()
                            ImageButtonExample()
                        }
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Roberto Chacón, Kevin Moreno",
        modifier = modifier
    )
}







