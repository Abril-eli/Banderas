package Screens
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

@Composable
fun BanderaScreen(modifier: Modifier= Modifier){
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Row(
            modifier = Modifier.fillMaxWidth().weight(1f).background(Color.Blue)
        ) { }

        Row(
            modifier = Modifier.fillMaxWidth().weight(1f).background(Color.White)
        ) { }

        Row(modifier = Modifier.fillMaxWidth().weight(1f).background(Color.Red)) { }
    }
}
@Preview(showBackground = true)
@Composable
fun BanderaPreview(){
    BanderaScreen()
}