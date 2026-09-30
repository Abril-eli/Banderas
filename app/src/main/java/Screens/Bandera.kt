package Screens
import android.R
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Canvas
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontVariation.width
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import java.nio.file.Files.size
import java.time.temporal.TemporalQueries.offset

@Composable
    fun BanderaScreen(modifier: Modifier = Modifier) {
    Canvas(modifier = modifier.fillMaxSize()) {
        drawRect(color = Color(0xFFE30A17))
        val c = size.height / 2f
        val cc = size.height * .3f
        drawCircle(
            color = Color.White,
            radius = cc, center = Offset(size.width * 0.38f, c)
        )
        drawCircle(
            color = Color(0xFFE30A17), radius = size.height * 0.24f, center =
                Offset(size.width * 0.38f + size.height * .09f, c)
        )

        val center = Offset(size.width * 0.58f, c)
        val r = size.height * 0.10f

        val puntos = List(5) { i ->
            val angulo = Math.toRadians((-90 + i * 72).toDouble())
            Offset(
                center.x + (r * kotlin.math.cos(angulo)).toFloat(),
                center.y + (r * kotlin.math.sin(angulo)).toFloat()
            )
        }
        drawLine(Color.White, puntos[0], puntos[2], strokeWidth = 4f)
        drawLine(Color.White, puntos[2], puntos[4], strokeWidth = 4f)
        drawLine(Color.White, puntos[4], puntos[1], strokeWidth = 4f)
        drawLine(Color.White, puntos[1], puntos[3], strokeWidth = 4f)
        drawLine(Color.White, puntos[3], puntos[0], strokeWidth = 4f)
    }
}

@Preview(showBackground = true)
    @Composable
    fun BanderaPreview() {
        BanderaScreen(modifier = Modifier.fillMaxSize())
    }
