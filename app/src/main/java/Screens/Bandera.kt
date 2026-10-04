package Screens

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Path

@Composable
    fun BanderaScreen(modifier: Modifier = Modifier) {
   val caj
        }
        Canvas(
            modifier = Modifier
                .align(Alignment.Center)
                .size(60.dp)
        ) {
            val path = starOfDavidPath(
                cx = size.width / 2,
                cy = size.height / 2,
                r = size.width / 2
            )
            drawPath(path = path, color = Color(0xFF0A35AF))
        }
    }
}
fun starOfDavidPath(cx: Float, cy: Float, r: Float): Path {
    val path = Path()
    for (i in 0..2) {
        val angle = Math.toRadians((-90.0 + i * 120.0))
        val x = cx + r * kotlin.math.cos(angle).toFloat()
        val y = cy + r * kotlin.math.sin(angle).toFloat()
        if (i == 0) path.moveTo(x, y) else path.lineTo(x, y)
    }
    path.close()
    for (i in 0..2) {
        val angle = Math.toRadians((90.0 + i * 120.0))
        val x = cx + r * kotlin.math.cos(angle).toFloat()
        val y = cy + r * kotlin.math.sin(angle).toFloat()
        if (i == 0) path.moveTo(x, y) else path.lineTo(x, y)
    }
    path.close()

    return path
    }
@Preview(showBackground = true)
    @Composable
    fun BanderaPreview() {
        BanderaScreen(modifier = Modifier.fillMaxSize())
    }
