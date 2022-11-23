package com.metehanbolat.composeuitest

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp

@Composable
fun FirstScreen(
    onClickAction: (String) -> Unit
) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Button(
            modifier = Modifier
                .size(60.dp)
                .clip(CircleShape),
            onClick = { onClickAction("1") }
        ) {
            Text(text = "1")
        }
        Button(
            modifier = Modifier
                .size(60.dp)
                .clip(CircleShape),
            onClick = { onClickAction("2") }
        ) {
            Text(text = "2")
        }
        Button(
            modifier = Modifier
                .size(60.dp)
                .clip(CircleShape),
            onClick = { onClickAction("+") }
        ) {
            Text(text = "+")
        }
        Button(
            modifier = Modifier
                .size(60.dp)
                .clip(CircleShape),
            onClick = { onClickAction("/") }
        ) {
            Text(text = "/")
        }
        
        Text(text = "12+/")

    }
}