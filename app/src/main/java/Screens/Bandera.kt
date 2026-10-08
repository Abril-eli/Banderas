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
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PaintingStyle.Companion.Stroke
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout

@Composable
    fun BanderaScreen(modifier: Modifier = Modifier) {
 Column (modifier = modifier.fillMaxSize()) {
            Canvas(modifier = modifier.fillMaxSize()) {
                drawRect(Color.Red, size = Size(size.width, size.height / 2f)
                )
                val band = size.height / 2f /6f
                for (i in 0 until 6) {
                    if (i % 2 == 0) drawRect(
                        color = Color(0xFF002E6E),
                        topLeft = Offset(0f,size.height/2f + i * band),
                        size = Size(size.width, band)
                    )
                    val centroSol = Offset(
                        size.width / 2f,
                        size.height * 0.35f
                    )

                    drawCircle(
                        color = Color.Yellow,
                        radius = size.width * 0.12f,
                        center = centroSol
                    )

// Rayos
                    for (i in 0 until 17) {
                        val angulo = Math.toRadians((i * 360.0 / 17))

                        val x1 = centroSol.x + (size.width * 0.12f) * kotlin.math.cos(angulo).toFloat()
                        val y1 = centroSol.y + (size.width * 0.12f) * kotlin.math.sin(angulo).toFloat()

                        val x2 = centroSol.x + (size.width * 0.18f) * kotlin.math.cos(angulo).toFloat()
                        val y2 = centroSol.y + (size.width * 0.18f) * kotlin.math.sin(angulo).toFloat()

                        drawLine(
                            color = Color.Yellow,
                            start = Offset(x1, y1),
                            end = Offset(x2, y2),
                            strokeWidth = 6f
                        )
                        val ave = Path().apply {
                            moveTo(size.width * 0.15f, size.height * 0.20f)

                            quadraticBezierTo(
                                size.width * 0.30f,
                                size.height * 0.05f,
                                size.width * 0.50f,
                                size.height * 0.15f
                            )

                            quadraticBezierTo(
                                size.width * 0.70f,
                                size.height * 0.05f,
                                size.width * 0.85f,
                                size.height * 0.20f
                            )
                        }
                        drawPath(
                            path = ave,
                            color = Color.Yellow,
                            style = Stroke(
                                width = 12f,
                                cap = StrokeCap.Round
                            )
                        )
                    }
                }
            }

    }}
@Preview(showBackground = true)
    @Composable
    fun BanderaPreview() {
        BanderaScreen(modifier = Modifier.fillMaxSize())
    }
