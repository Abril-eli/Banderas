package Screens
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout

@Composable
    fun BanderaScreen(modifier: Modifier = Modifier) {
    ConstraintLayout (modifier = modifier.fillMaxSize()) {
        Canvas(modifier = modifier.width(240.dp).height(290.dp)) {
            val mid = size.height / 2f
            val triangSuperior = Path().apply {
                moveTo(0f, 0f)
                lineTo(size.width * 0.92f, size.height * 0.40f)
                lineTo(0f, mid)
                close()
            }
            drawPath(triangSuperior, color = Color.Blue)
            val mida = size.height / 2f
            val triangSuperiori = Path().apply {
                moveTo(0f, 0f)
                lineTo(size.width * 0.80f, size.height * 0.40f)
                lineTo(0f, mida)
                close()
            }
            drawPath(triangSuperiori, color = Color.Red)
            val triangInferiorb = Path().apply {
                moveTo(0f, mid)
                lineTo(size.width * 0.92f, size.height * 0.75f)
                lineTo(0f, size.height)
                close()
            }
            drawPath(triangInferiorb, color = Color.Blue)
            val triangInferiorRojo = Path().apply {
                moveTo(0f, mid)
                lineTo(size.width * 0.80f, size.height * 0.75f)
                lineTo(0f, size.height)
                close()
            }
            drawPath(triangInferiorRojo, color = Color.Red)
            val lunaX = size.width * 0.28f
            val lunaY = size.height * 0.25f
            val radio = size.width * 0.08f

            drawCircle(
                color = Color.White,
                radius = radio,
                center = Offset(lunaX, lunaY)
            )

            drawCircle(
                color = Color.Red,
                radius = radio * 0.85f,
                center = Offset(lunaX + radio * 0.4f, lunaY)
            )
            drawCircle(
                color = Color.White,
                radius = size.width * 0.08f,
                center = Offset(
                    size.width * 0.30f,
                    size.height * 0.75f
                )
            )
            val centro = Offset(
                size.width * 0.30f,
                size.height * 0.75f
            )

            val radioInterior = size.width * 0.10f
            val radioExterior = size.width * 0.14f

            for (i in 0 until 12) {
                val angulo = Math.toRadians(i * 30.0)

                val x1 = centro.x + radioInterior * kotlin.math.cos(angulo).toFloat()
                val y1 = centro.y + radioInterior * kotlin.math.sin(angulo).toFloat()

                val x2 = centro.x + radioExterior * kotlin.math.cos(angulo).toFloat()
                val y2 = centro.y + radioExterior * kotlin.math.sin(angulo).toFloat()

                drawLine(
                    color = Color.White,
                    start = Offset(x1, y1),
                    end = Offset(x2, y2),
                    strokeWidth = 4f
                )
            }
        }
    }

    }
@Preview(showBackground = true)
    @Composable
    fun BanderaPreview() {
        BanderaScreen(modifier = Modifier.fillMaxSize())
    }
