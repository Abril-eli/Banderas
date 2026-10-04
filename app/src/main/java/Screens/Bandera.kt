package Screens
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Path

@Composable
    fun BanderaScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.width(50.dp).fillMaxWidth().background(Color.Red)
    ) {
        Canvas(modifier = Modifier.fillMaxSize()) {
            drawCircle(
                color = Color.White, radius =
                    100f, center = Offset(120f, size.height / 2)
            )
            drawCircle(
                color = Color.Red, radius =
                    90f, center = Offset(140f, size.height / 2)
            )
        }
        Estrella(modifier = Modifier
            .size(50.dp)
        .align(Alignment.CenterStart)
        .offset( 150.dp)
        )
    }
}
@Composable
fun Estrella(
    modifier: Modifier = Modifier,
    color: Color = Color.White,
) {
    Canvas(modifier = modifier) {
        val cx = size.width / 2
        val cy = size.height / 2

        val radioExterior = minOf(size.width, size.height) / 2
        val radioInterior = radioExterior * 0.4f

        val path = Path()

        for (i in 0 until 10) {
            val radio = if (i % 2 == 0) radioExterior else radioInterior
            val angulo = Math.toRadians((i * 36.0) - 90)

            val x = (cx + radio * kotlin.math.cos(angulo)).toFloat()
            val y = (cy + radio * kotlin.math.sin(angulo)).toFloat()

            if (i == 0) path.moveTo(x, y)
            else path.lineTo(x, y)
        }
        path.close()
        drawPath(path, color)
    }
}
@Preview(showBackground = true)
    @Composable
    fun BanderaPreview() {
        BanderaScreen(modifier = Modifier.fillMaxSize())
    }
