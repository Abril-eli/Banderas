package Screens
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
    fun BanderaScreen(modifier: Modifier = Modifier) {
            Box(modifier= Modifier.size(250.dp).
            background(Color(0xFFD52B1E)),contentAlignment = Alignment.Center) {
                Box(Modifier.width(50.dp).height(100.dp).background(Color.White))
                Box(Modifier.width(100.dp).height(50.dp).background(Color.White))
            }
}
@Preview(showBackground = true)
    @Composable
    fun BanderaPreview() {
        BanderaScreen(modifier = Modifier.fillMaxSize())
    }
