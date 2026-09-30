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
            color = Color(0xFF009B3A)
        )
        val rombo = Path().apply {
            moveTo(width / 2f, height * 0.15f)
            lineTo(width * 0.85f, height / 2f)
            lineTo(width / 2f, height * 0.85f)
            lineTo(width * 0.15f, height / 2f)
        }
        drawPath(
            path = rombo,
            color = Color(0xFFFFDF00)
        )
        val circleRadius = size.minDimension * 0.22f
        drawCircle(
            color = Color(0xFF002776),
            radius = circleRadius,
            center = center
        )
        val whiteBand = Path().apply {
            moveTo(center.x - circleRadius * 0.9f, center.y + circleRadius * 0.15f)
            cubicTo(
                center.x - circleRadius * 0.3f, center.y - circleRadius * 0.3f,
                center.x + circleRadius * 0.3f, center.y - circleRadius * 0.4f,
                center.x + circleRadius * 0.9f, center.y - circleRadius * 0.1f
            )
            lineTo(center.x + circleRadius * 0.9f, center.y + circleRadius * 0.05f)
            cubicTo(
                center.x + circleRadius * 0.3f, center.y - circleRadius * 0.2f,
                center.x - circleRadius * 0.3f, center.y - circleRadius * 0.1f,
                center.x - circleRadius * 0.9f, center.y + circleRadius * 0.3f
            )
        }
        drawPath(
            path = whiteBand,
            color = Color.White
        )
    }
}
@Composable
fun Colum(modifier: Modifier) {
    TODO("Not yet implemented")
}

@Preview(showBackground = true)
    @Composable
    fun BanderaPreview() {
        BanderaScreen(modifier = Modifier.fillMaxSize())
    }
