package com.example.banderas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.banderas.ui.theme.BanderasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BanderasTheme {
                BanderaScreen()
            }
        }
    }
}

@Composable
fun BanderaScreen() {
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        Column(
            modifier = Modifier.padding(innerPadding).fillMaxSize()
        ) {
            Row(
                modifier = Modifier.fillMaxWidth().weight(1f).background(Color(0xFFAA151B))
            ) {
            }
            Row(
                modifier = Modifier.fillMaxWidth().weight(2f).background(Color(0xFFF1BF00))
            ) {
                Image(
                    painter = painterResource(id = R.drawable.espaa),
                    contentDescription = "escudo",
                    modifier= Modifier.size(250.dp).padding()
                )
            }
            Row(modifier = Modifier.fillMaxWidth().weight(1f).background(Color(0xFFAA151B)) ){ }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun BanderaScreenPreview() {
    BanderasTheme {
        BanderaScreen()
    }
}

