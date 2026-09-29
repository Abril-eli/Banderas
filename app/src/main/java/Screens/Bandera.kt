package Screens
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension

@Composable
    fun BanderaScreen(modifier: Modifier = Modifier) {
    ConstraintLayout(modifier = modifier.fillMaxSize()
    ) {
        val (caja,caja1,caja2) = createRefs()
        val lineaguia=createGuidelineFromTop(0.2f)
        val lineaguia2=createGuidelineFromTop(0.3f)

        Box(modifier = Modifier.size(80.dp).background(Color(0xFFB22234)).
        constrainAs(caja) {
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(parent.top)
            bottom.linkTo(parent.bottom)
            height = Dimension.fillToConstraints
            width = Dimension.fillToConstraints
//
        })
        Box(modifier = Modifier.size(80.dp).background(Color.White).constrainAs(caja1) {
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(lineaguia)
            bottom.linkTo(lineaguia2)
            height = Dimension.fillToConstraints
            width = Dimension.fillToConstraints
        })
        Box(modifier = Modifier.size(80.dp).background(Color(0xFFB22234)).constrainAs(caja2) {
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(lineaguia2)
            bottom.linkTo(parent.bottom)
            height= Dimension.fillToConstraints
            width= Dimension.fillToConstraints

        })
    }
}
@Preview(showBackground = true)
    @Composable
    fun BanderaPreview() {
        BanderaScreen(modifier = Modifier.fillMaxSize())
    }
