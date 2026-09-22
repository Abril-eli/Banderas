package com.example.banderas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.banderas.ui.theme.BanderasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BanderasTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    Row(
                        modifier = Modifier.padding(innerPadding).fillMaxSize()
                    ) {
                        Box(
                            modifier = Modifier.fillMaxHeight().weight(1f).background(Color(0xFF006341)),
                                    contentAlignment = Alignment.Center
                        ){
                                    Image(
                                                painter = painterResource(id = R.drawable.mexico),
                                                contentDescription = "Escudo nacional",
                                                modifier = Modifier.size(100.dp)

                                    )
                    }

                        Box(
                            modifier = Modifier.fillMaxHeight().weight(1f).background(Color.White)
                        ) { }

                        Box(modifier = Modifier.fillMaxHeight().weight(1f).background(Color(0xFFCE1126))) { }
                    }
                }
            }
        }
    }
}