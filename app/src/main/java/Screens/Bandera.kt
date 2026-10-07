package Screens
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout

@Composable
    fun BanderaScreen(modifier: Modifier = Modifier) {
    ConstraintLayout(modifier = modifier.fillMaxSize()) {
        Canvas(
            modifier = Modifier
                .fillMaxSize()

        ) {
            val triangulo = Path().apply {
                moveTo(0f, 0f)
                lineTo(size.width, 0f)
                lineTo(size.width, size.height)
                close()
            }
            val triangulo2 = Path().apply {
                moveTo(0f, 0f)
                lineTo(0f, size.height)
                lineTo(size.width, size.height)
                close()
            }
            drawPath(
                path = triangulo,
                color = Color(0xFFCC0000),
            )
            drawPath(
                path = triangulo2,
                color = Color.Black,
            )
        }
        Estrella(
            modifier = Modifier
                .size(40.dp)
                .offset(x = 150.dp, y = 100.dp)
        )
    }
    Estrella(
        modifier = Modifier
            .size(40.dp)
            .offset(x = 270.dp, y = 200.dp)
    )
Estrella(
modifier = Modifier
.size(40.dp)
.offset(x = 200.dp, y=250.dp) )
    Estrella(
        modifier = Modifier
            .size(40.dp)
            .offset(x = 150.dp, y=320.dp) )
    Estrella(
        modifier = Modifier
            .size(20.dp)
            .offset(x = 100.dp, y=370.dp) )
    Estrella(
        modifier = Modifier
            .size(50.dp)
            .offset(x = 450.dp, y = 150.dp),
        color = Color.Yellow
    )
}


    @Composable
    fun Estrella(modifier: Modifier = Modifier,color: Color = Color.White) {
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
                        color = color
            )
        }
    }
@Preview(showBackground = true)
    @Composable
    fun BanderaPreview() {
        BanderaScreen(modifier = Modifier.fillMaxSize())
    }
