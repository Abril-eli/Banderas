package Screens
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontVariation.width
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension

@Composable
    fun BanderaScreen(modifier: Modifier = Modifier) {
        Box(
            modifier = modifier.aspectRatio(1f)
                .background(Color.Red),

        ) {
            Box(
                modifier = Modifier.align(Alignment.Center)
                    .fillMaxWidth(0.2f)
                    .fillMaxHeight(0.62f)
                    .background(Color.White)
            )
            Box(
                modifier = Modifier.align(Alignment.Center)
                    .fillMaxHeight(0.2f)
                    .fillMaxWidth(0.62f)
                    .background(Color.White)
            )
        }
    }
@Preview(showBackground = true)
    @Composable
    fun BanderaPreview() {
        BanderaScreen(modifier = Modifier.fillMaxSize())
    }
