package Screens
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
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
    ConstraintLayout(modifier = modifier.fillMaxSize()) {
            Canvas(modifier = modifier.fillMaxSize()) {
                drawRect(color = Color.Blue)
                val centroX = size.width / 2
                val centroY = size.height / 2
                val grosorDiagonalBlanca = size.height * 0.22f
                val grosorDiagonalBlanca2 = size.width * 0.22f
                val grosorDiagonalRojo2 = size.width * 0.11f
                val grosorDiagonalRojo = size.height * 0.11f
                drawLine(
                    Color.White,
                    Offset(0f, 0f),
                    Offset(size.width, size.height),
                    grosorDiagonalBlanca
                )
                drawLine(
                    Color.White,
                    Offset(size.width, 0f),
                    Offset(0f, size.height),
                    grosorDiagonalBlanca
                )
                drawLine(
                    Color.Red,
                    Offset(0f, 0f),
                    Offset(size.width, size.height),
                    grosorDiagonalRojo
                )
                drawLine(
                    Color.Red,
                    Offset(size.width, 0f),
                    Offset(0f, size.height),
                    grosorDiagonalRojo
                )
                drawLine(Color.White, Offset(centroX, 0f),
                Offset(centroX, size.height)

                )
                drawLine(
                    Color.White,
                    Offset( 0f,size.height/2),
                    Offset( size.width,size.height/2),
                    grosorDiagonalBlanca2
                )
                drawLine(
                    Color.Red,
                    Offset( 0f,size.height/2),
                    Offset( size.width,size.height/2),
                    grosorDiagonalRojo2
                )
                drawLine(Color.White,
                    Offset(centroX,0f),
                Offset(centroX, size.height),
                    grosorDiagonalBlanca2
                )
                drawLine(
                    Color.Red,
                    Offset( centroX,0f),
                    Offset( centroX,size.height),
                    grosorDiagonalRojo2
                )
                drawLine(
                    Color.Red,
                    Offset( 0f,centroY),
                    Offset( size.width,centroY),
                    grosorDiagonalRojo2
                )



//    @Composable
//    fun Estrella(modifier: Modifier = Modifier,color: Color = Color.White) {
//        Canvas(modifier = modifier) {
//            val cx = size.width / 2
//            val cy = size.height / 2
//
//            val radioExterior = minOf(size.width, size.height) / 2
//            val radioInterior = radioExterior * 0.4f
//
//            val path = Path()
//
//            for (i in 0 until 10) {
//                val radio = if (i % 2 == 0) radioExterior else radioInterior
//                val angulo = Math.toRadians((i * 36.0) - 90)
//
//                val x = (cx + radio * kotlin.math.cos(angulo)).toFloat()
//                val y = (cy + radio * kotlin.math.sin(angulo)).toFloat()
//
//                if (i == 0)
//                    path.moveTo(x, y)
//                else
//                    path.lineTo(x, y)
//            }
//
//            path.close()
//            drawPath(
//                        path = path,
//                        color = color
//            )
//
//
            }
    }
}
@Preview(showBackground = true)
    @Composable
    fun BanderaPreview() {
        BanderaScreen(modifier = Modifier.fillMaxSize())
    }
