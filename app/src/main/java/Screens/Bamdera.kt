
package Screens
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun BanderaScreen(modifier: Modifier = Modifier) {
    Column(Modifier.fillMaxSize()) {
        Box(Modifier.weight(1f).fillMaxWidth().background(Color(0xFF74ACDF)))
        Box(Modifier.weight(1f).fillMaxWidth().background(Color.White), contentAlignment = Alignment.Center
        ) {
            Box(Modifier.size(50.dp).clip(CircleShape).background(Color(0xFFF6B40E))
            )
        }
        Box(Modifier.weight(1f).fillMaxWidth().background(Color(0xFF74ACDF)))
    }
}
@Preview(showBackground = true)
@Composable
fun BanderaPreview(){
    BanderaScreen()
}