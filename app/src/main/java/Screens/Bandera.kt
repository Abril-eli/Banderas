package Screens

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
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

        Box(modifier = Modifier.size(80.dp).background(Color.Blue).
        })
        Box(modifier = Modifier.size(80.dp).background(Color.White)
        })
        Box(modifier = Modifier.size(80.dp).background(Color.Blue)
        })
        Box(modifier = Modifier.size(80.dp).background(Color.White)
        })
        Box(modifier = Modifier.size(80.dp).background(Color.Blue)
        })

        Canvas(
            modifier = Modifier
                .constrainAs(cajaCanvas) {
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
        Estrella(
            modifier= Modifier.size(80.dp).constrainAs(estrella){
                start.linkTo(parent.start, margin = 20.dp)
                top.linkTo(parent.top)
                bottom.linkTo(parent.bottom)
            }

        )
    }
}
@Composable
fun Estrella(
    modifier: Modifier = Modifier,
    color: Color = Color.White, ) {
    Canvas(modifier = modifier) {
        val cx = size.width / 2
        val cy = size.height / 2

        val radioExterior = minOf(size.width, size.height) / 2
        val radioInterior = radioExterior * 0.4f

        val path = Path()

        for (i in 0 until 10) {
            val radio = if (i % 2 == 0) radioExterior else radioInterior
            val angulo = Math.toRadians((i * 36.0) - 90)

            val x = (cx + radio * kotlin.math.cos(angulo)).toFloat()
            val y = (cy + radio * kotlin.math.sin(angulo)).toFloat()

            if (i == 0) path.moveTo(x, y)
            else path.lineTo(x, y)
        }
        path.close()
        drawPath(path, color)
    }
}
@Preview(showBackground = true)
    @Composable
    fun BanderaPreview() {
        BanderaScreen(modifier = Modifier.fillMaxSize())
    }
