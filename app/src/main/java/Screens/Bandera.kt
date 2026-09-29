package Screens
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.example.banderas.R

    @Composable
    fun BanderaScreen(modifier: Modifier = Modifier) {
        ConstraintLayout(modifier = modifier.fillMaxSize()
        ) {
            val (caja,caja1,caja2) = createRefs()
            val lineaguia=createGuidelineFromTop(0.333f)
            val lineaguia2=createGuidelineFromTop(0.666f)

            Box(modifier = Modifier.size(80.dp).background(Color.Black).
            constrainAs(caja) {
                start.linkTo(parent.start)
                end.linkTo(parent.end)
                top.linkTo(parent.top)
                bottom.linkTo(parent.bottom)
                height = Dimension.fillToConstraints
                width = Dimension.fillToConstraints
//
            })
            Box(modifier = Modifier.size(80.dp).background(Color(0xFFDD0000)).constrainAs(caja1) {
                start.linkTo(parent.start)
                end.linkTo(parent.end)
                top.linkTo(lineaguia)
                bottom.linkTo(lineaguia2)
                height = Dimension.fillToConstraints
                width = Dimension.fillToConstraints
            })
            Box(modifier = Modifier.size(80.dp).background(Color(0xFFFFCE00)).constrainAs(caja2) {
                start.linkTo(parent.start)
                end.linkTo(parent.end)
                top.linkTo(lineaguia2)
                bottom.linkTo(parent.bottom)
                height= Dimension.fillToConstraints
                width= Dimension.fillToConstraints

            })
        }
    }

@Composable
fun Colum(modifier: Modifier) {
    TODO("Not yet implemented")
}

@Preview(showBackground = true)
    @Composable
    fun BanderaPreview() {
        BanderaScreen(modifier = Modifier.fillMaxSize())
    }
