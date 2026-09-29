package Screens
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.tooling.preview.Preview

@Composable
    fun BanderaScreen(modifier: Modifier = Modifier) {
    Canvas(modifier = modifier) {
        val width = size.width
        val height = size.height
        drawRect(
            color = Color.White
        )
        val circleRadius = size.minDimension * 0.22f
        drawCircle(
            color = Color.Red,
            radius = circleRadius,
            center = center
        )
    }
    @Composable
    fun Colum(modifier: Modifier) {
        TODO("Not yet implemented")
    }
}
@Preview(showBackground = true)
    @Composable
    fun BanderaPreview() {
        BanderaScreen(modifier = Modifier.fillMaxSize())
    }
