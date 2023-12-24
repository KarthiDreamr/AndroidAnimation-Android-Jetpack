package com.example.exercise4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.exercise4.ui.theme.Exercise4Theme

//https://www.youtube.com/watch?v=7yY2OocGiQU

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Exercise4Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    HomePage()
                }
            }
        }
    }
}

@Composable
fun HomePage() {

    var blue by remember { mutableStateOf(true) }
    val boxColor by animateColorAsState(if(blue) Color.Red else Color.Green, label = "BlueOrange")

    var bigBox by remember { mutableStateOf(true) }
    val boxSize by animateDpAsState(if(bigBox) 80.dp else 120.dp, label = "BigSmall")

    var visibeBox by remember { mutableStateOf(true) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 30.dp, vertical = 30.dp)
    ) {
        Button(
            onClick = {
                blue = !blue
            }
        ) {
            Text("Change Color")
        }
        Spacer(modifier = Modifier.size(20.dp))

        Button(
            onClick = {
                bigBox = !bigBox
            }
        ) {
            Text("Change Size")
        }
        Spacer(modifier = Modifier.size(20.dp))

        Button(
            onClick = {
                visibeBox = !visibeBox
            }
        ) {
            Text("Hide / Show")
        }
        Spacer(modifier = Modifier.size(20.dp))

        AnimatedVisibility(visibeBox){
            Box (
                modifier = Modifier
                    .size(boxSize)
                    .background(boxColor)
            )
        }

    }
}
