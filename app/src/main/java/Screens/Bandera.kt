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
                val apex = Offset(size.width * 0.36f, size.height / 2f)
                drawLine(Color.White, Offset(0f, 0f), apex, size.height * 0.30f)
                drawLine(Color.White, Offset(0f, size.height), apex, size.height * 0.30f)
                drawLine(Color.White, apex, Offset(size.width, size.height * 0.14f), size.height * 0.30f)
                drawLine(Color.White, apex, Offset(size.width, size.height * 0.86f), size.height * 0.30f)

                drawLine(Color.Green, Offset(0f, 0f), apex, size.height * 0.20f)
                drawLine(Color.Green, Offset(0f, size.height), apex, size.height * 0.20f)
                drawLine(Color.Green, apex, Offset(size.width, size.height * 0.14f), size.height * 0.20f)
                drawLine(Color.Green, apex, Offset(size.width, size.height * 0.86f), size.height * 0.20f)

            }
    }
}
@Preview(showBackground = true)
    @Composable
    fun BanderaPreview() {
        BanderaScreen(modifier = Modifier.fillMaxSize())
    }
