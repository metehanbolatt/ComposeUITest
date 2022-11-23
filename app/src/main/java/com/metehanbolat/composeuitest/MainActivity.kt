package com.metehanbolat.composeuitest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.metehanbolat.composeuitest.ui.theme.ComposeUITestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeUITestTheme {
                FirstScreen {

                }
            }
        }
    }
}
