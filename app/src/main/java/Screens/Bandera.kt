package Screens
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.tooling.preview.Preview


@Composable
    fun BanderaScreen(modifier: Modifier = Modifier) {
    val azul = Color(0xFF003893)
    val amarillo = Color(0xFFFCD116)
    val rojo = Color(0xFFD92226)
    val verde = Color(0xFF007A3D)

    val colors = listOf(azul, amarillo, rojo, Color.White, verde)
    val angles = listOf(90f, 72f, 54f, 36f, 18f, 0f)

    Column(modifier = modifier) {
        Box(modifier = Modifier
            .fillMaxSize()
            .drawBehind {
                val origin = Offset(0f, size.height)

                fun getRayIntersection(angleDeg: Float): Offset {
                    val rad = Math.toRadians(angleDeg.toDouble())
                    val cos = kotlin.math.cos(rad).toFloat()
                    val sin = kotlin.math.sin(rad).toFloat()

                    if (sin == 0f) return Offset(size.width, origin.y)
                    if (cos == 0f) return Offset(origin.x, 0f)

                    val tTop = origin.y / sin
                    val xTop = origin.x + tTop * cos
                    if (xTop in 0f..size.width && tTop >= 0) {
                        return Offset(xTop, 0f)
                    }

                    val tRight = (size.width - origin.x) / cos
                    val yRight = origin.y - tRight * sin
                    if (yRight in 0f..size.height && tRight >= 0) {
                        return Offset(size.width, yRight)
                    }

                    return origin
                }

                for (i in 0 until colors.size) {
                    val angleStart = angles[i + 1]
                    val angleEnd = angles[i]

                    val pointA = getRayIntersection(angleStart)
                    val pointB = getRayIntersection(angleEnd)

                    val path = Path().apply {
                        moveTo(origin.x, origin.y)
                        lineTo(pointA.x, pointA.y)

                        val aIsTop = pointA.y == 0f
                        val bIsRight = pointB.x == size.width

                        if (aIsTop && bIsRight) {
                            lineTo(size.width, 0f) // Corregido aquí
                        }

                        lineTo(pointB.x, pointB.y)
                        close()
                    }

                    drawPath(path = path, color = colors[i])
                }
            }
        )
    }
    }
@Preview(showBackground = true)
    @Composable
    fun BanderaPreview() {
        BanderaScreen(modifier = Modifier.fillMaxSize())
    }
