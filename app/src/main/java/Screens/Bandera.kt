package Screens
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension

@Composable
    fun BanderaScreen(modifier: Modifier = Modifier) {
    ConstraintLayout(modifier = modifier.fillMaxSize()) {
                val (caja,caja1,) = createRefs()
                val lineaguia=createGuidelineFromTop(0.444f)
                val lineaguia2=createGuidelineFromTop(0.99f)

                Box(modifier = Modifier.size(80.dp).background(Color.Blue).
                constrainAs(caja) {
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    height = Dimension.fillToConstraints
                    width = Dimension.fillToConstraints
                })
                Box(modifier = Modifier.size(80.dp).background(Color.Yellow).constrainAs(caja1) {
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    top.linkTo(lineaguia)
                    bottom.linkTo(lineaguia2)
                    height = Dimension.fillToConstraints
                    width = Dimension.fillToConstraints
                })
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
                val triWidth = size.width * 0.20f
                val trianglePath = Path().apply {
                    moveTo(0f, 0f)
                    lineTo(triWidth, size.height / 2f)
                    lineTo(0f, size.height)
                    close()
                }
                drawPath(trianglePath, color = Color.Black)
            }
    }
}
@Preview(showBackground = true)
    @Composable
    fun BanderaPreview() {
        BanderaScreen(modifier = Modifier.fillMaxSize())
    }
