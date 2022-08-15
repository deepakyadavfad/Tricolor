package com.example.tricolor

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tricolor.ui.theme.TricolorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Box(modifier = Modifier
                .fillMaxSize()
                .background(Color.Transparent), contentAlignment = Alignment.Center){
                MyCircle(100f,0xFF000080)
                MyCircle(x = 86f,0xFFFFFFFF)
                ashokaChakra()
            }

        }
    }}

@Composable
fun MyCircle(x : Float , y : Long){
    Canvas(modifier = Modifier.size(x.dp), onDraw = {
        drawCircle(color = Color(y))
    })
}
@Composable
fun ashokaChakra(){
    for(i in 0..360 step 15){
        Divider(color = Color(0xFF000080) , modifier = Modifier
            .width(86.dp)
            .height(5.8.dp)
            .rotate(i.toFloat()))
    }
}

