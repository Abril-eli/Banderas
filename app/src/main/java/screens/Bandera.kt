package screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

class Bandera {
    @Composable
    fun BanderaScreen(modifier: Modifier= Modifier){
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            Row(
                modifier = Modifier.fillMaxWidth().weight(1f).background(Color.Black)
            ) { }

            Row(
                modifier = Modifier.fillMaxWidth().weight(1f).background(Color(0xFFDD0000))
            ) { }

            Row(modifier = Modifier.fillMaxWidth().weight(1f).background(Color(0xFFFFCE00)) ){ }
        }
    }
    @Preview(showBackground = true)
    @Composable
    fun BanderaPreview(){
        BanderaScreen()
    }
}