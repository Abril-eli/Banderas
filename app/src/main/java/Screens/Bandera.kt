package Screens
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension

@Composable
    fun BanderaScreen(modifier: Modifier = Modifier) {
    ConstraintLayout(modifier = modifier.fillMaxSize()
    ) {
        val (caja,caja1,caja2) = createRefs()
        val lineaguia=createGuidelineFromTop(0.388f)//use
        val linea2=createGuidelineFromStart(0.5f)//use
        Box(modifier = Modifier.size(80.dp).background(Color(0xFFB22234)).
        constrainAs(caja) {
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(parent.top)
            bottom.linkTo(parent.bottom)
            height = Dimension.fillToConstraints
            width = Dimension.fillToConstraints
        })
        Column(modifier = Modifier.constrainAs(caja1) {
            start.linkTo(parent.start)
            end.linkTo(parent.end)
            top.linkTo(parent.top)
            bottom.linkTo(parent.bottom)
            height = Dimension.fillToConstraints
            width = Dimension.fillToConstraints
        }
        ){
            repeat(13) { i ->
                Box(
                    modifier = Modifier.weight(.1f).fillMaxSize()
                        .background(
                            if (i % 2 == 0)
                                Color(0xFFB22234)
                            else
                                Color.White
                        )
                )
            }}
        Box(modifier = Modifier.size(80.dp).
        background(Color.Blue).constrainAs(caja2) {
            start.linkTo(parent.start)
            end.linkTo(linea2)
            top.linkTo(parent.top)
            bottom.linkTo(lineaguia)
            height = Dimension.fillToConstraints
            width = Dimension.fillToConstraints
        })
                }
}
@Preview(showBackground = true)
    @Composable
    fun BanderaPreview() {
        BanderaScreen(modifier = Modifier.fillMaxSize())
    }
