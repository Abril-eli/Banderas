package Screens

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Path
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension

@Composable
    fun BanderaScreen(modifier: Modifier = Modifier) {
    ConstraintLayout(
        modifier = modifier.fillMaxSize()
    ) {
        val (caja, caja1,caja2,caja3, cajaCanvas) = createRefs()
        val lineaguia = createGuidelineFromTop(0.2f)
        val lineaguia2 = createGuidelineFromTop(0.4f)
        val lineaguia3 = createGuidelineFromTop(0.6f)
        val lineaguia4 = createGuidelineFromTop(0.8f)


        Box(modifier = Modifier.size(80.dp).background(Color.Blue).constrainAs(caja) {
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(parent.top)
            bottom.linkTo(lineaguia)
            height = Dimension.fillToConstraints
            width = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.size(80.dp).background(Color.White).constrainAs(caja1) {
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(lineaguia)
            bottom.linkTo(lineaguia2)
            height = Dimension.fillToConstraints
            width = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.size(80.dp).background(Color.Blue).constrainAs(caja2) {
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(lineaguia2)
            bottom.linkTo(lineaguia3)
            height = Dimension.fillToConstraints
            width = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.size(80.dp).background(Color.White).constrainAs(caja3) {
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(lineaguia3)
            bottom.linkTo(lineaguia4)
            height = Dimension.fillToConstraints
            width = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.size(80.dp).background(Color.Blue).constrainAs(caja3) {
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(lineaguia4)
            bottom.linkTo(parent.bottom)
            height = Dimension.fillToConstraints
            width = Dimension.fillToConstraints
        })

        Canvas(
            modifier= Modifier
                .constrainAs(cajaCanvas){
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    top.linkTo(parent.top)
                    bottom.linkTo(parent.bottom)
                    height = Dimension.fillToConstraints
                    width = Dimension.fillToConstraints
                }
        ) {
            val triangle = Path().apply {
                moveTo(0f, 0f)
                lineTo(size.width * 0.4f, size.height / 2)
                lineTo(0f, size.height)
                close()
            }
            drawPath(
                path = triangle, color = Color.Red
            )

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
