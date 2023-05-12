package com.emmanuel_rono.jpt_compose_one

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.key.Key.Companion.H
import androidx.compose.ui.tooling.preview.Preview
import com.emmanuel_rono.jpt_compose_one.ui.theme.JptCompose_oneTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(modifier = Modifier
                .background(color = Color.Green)
                .fillMaxWidth(0.5f)
            ) {
                Text(text = "Hello")
                Text(text = "Compose")
            }
        }
    }

}