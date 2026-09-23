package Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.banderas.R

@Composable
fun BanderaScreen(modifier: Modifier= Modifier){
    Column(
        modifier = Modifier.fillMaxSize()
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
@Preview(showBackground = true)
@Composable
fun BanderaPreview(){
    BanderaScreen()
}
