package Screens
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension

@Composable
    fun BanderaScreen(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxSize()
    ) {
        Canvas(modifier = Modifier.fillMaxSize()) {
            repeat(10) { i ->
                val rectWidth = 100f
                val rectHeight = 100f
                drawRect(
                    color = Color.Black,
                    topLeft = Offset(
                        (size.width - rectWidth) / 3 + 100,
                        (size.height - rectHeight) / 2
                    ),
                    size = Size(300f, 30f)
                )
                repeat(10) { i ->
                    val rectWidth2 = 300f
                    val rectHeight2 = 100f
                    drawRect(
                        color = Color.Black,
                        topLeft = Offset(
                            (size.width - rectWidth2) / 3+ 80,
                            (size.height - rectHeight2) / 2 + 20f
                        ),
                        size = Size(100f, 30f)
                    )
                    repeat(10) { i ->
                        val rectWidth3 = 300f
                        val rectHeight3 = 100f
                        drawRect(
                            color = Color.Black,
                            topLeft = Offset(
                                (size.width - rectWidth3) / 1-58,
                                (size.height - rectHeight3) / 2 + 20f
                            ),
                            size = Size(100f, 30f)
                        )
                    }

                }
            }
        }
                }
}
@Preview(showBackground = true)
    @Composable
    fun BanderaPreview() {
        BanderaScreen(modifier = Modifier.fillMaxSize())
    }
