package Screens
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
@Composable
    fun BanderaScreen(modifier: Modifier = Modifier) {
    Box(modifier = modifier.fillMaxSize()) {
    Column(modifier = Modifier.fillMaxSize()) {
        Box(Modifier.weight(1f).fillMaxWidth().background(Color.Blue))
        Box(Modifier.fillMaxWidth().weight(1f).background(Color.White))
        Box(Modifier.fillMaxWidth().weight(1f).background(Color.Blue))
        Box(Modifier.fillMaxWidth().weight(1f).background(Color.White))
        Box(Modifier.fillMaxWidth().weight(1f).background(Color.Blue))

        }
        Canvas(
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth(0.4f) // Ocupa el 40% del ancho de la bandera
                .align(Alignment.CenterStart)
        ) {
            val triangulo = Path().apply {
                moveTo(0f, 0f)
                lineTo(size.width, size.height / 2) // Apunta hacia la mitad derecha
                lineTo(0f, size.height)
                close()
            }
            drawPath(
                path = triangulo,
                color = Color(0xFFCC0000) // Rojo oficial de la bandera cubana
            )
        }
        Estrella(
            modifier = Modifier
                .size(50.dp)
                .align(Alignment.CenterStart)
                .offset(x = 24.dp) )
    }
    }

    @Composable
    fun Estrella(modifier: Modifier = Modifier) {
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

                if (i == 0)
                    path.moveTo(x, y)
                else
                    path.lineTo(x, y)
            }

            path.close()

            drawPath(
                path = path,
                color = Color.White
            )
        }
    }
@Preview(showBackground = true)
    @Composable
    fun BanderaPreview() {
        BanderaScreen(modifier = Modifier.fillMaxSize())
    }
