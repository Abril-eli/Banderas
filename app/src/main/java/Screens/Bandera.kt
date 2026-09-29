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

        // 1. Fondo verde de la bandera
        drawRect(
            color = Color(0xFF009B3A)
        )

        // 2. Rombo amarillo
        val rombo = Path().apply {
            moveTo(width / 2f, height * 0.15f) // Arriba
            lineTo(width * 0.85f, height / 2f) // Derecha
            lineTo(width / 2f, height * 0.85f) // Abajo
            lineTo(width * 0.15f, height / 2f) // Izquierda
            close()
        }
        drawPath(
            path = rombo,
            color = Color(0xFFFFDF00)
        )

        // 3. Círculo azul
        val circleRadius = size.minDimension * 0.22f
        drawCircle(
            color = Color(0xFF002776),
            radius = circleRadius,
            center = center
        )

        // 4. Franja blanca curva (simulando la banda central)
        val whiteBand = Path().apply {
            // Curva superior de la franja
            moveTo(center.x - circleRadius * 0.9f, center.y + circleRadius * 0.15f)
            cubicTo(
                center.x - circleRadius * 0.3f, center.y - circleRadius * 0.3f,
                center.x + circleRadius * 0.3f, center.y - circleRadius * 0.4f,
                center.x + circleRadius * 0.9f, center.y - circleRadius * 0.1f
            )
            // Bajamos por el borde derecho de la franja
            lineTo(center.x + circleRadius * 0.9f, center.y + circleRadius * 0.05f)
            // Curva inferior de la franja de regreso
            cubicTo(
                center.x + circleRadius * 0.3f, center.y - circleRadius * 0.2f,
                center.x - circleRadius * 0.3f, center.y - circleRadius * 0.1f,
                center.x - circleRadius * 0.9f, center.y + circleRadius * 0.3f
            )
            close()
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
