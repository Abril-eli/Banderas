package Screens
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
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
        ConstraintLayout(modifier) {
            val (caja,caja1) = createRefs()
            val lineaguia=createGuidelineFromStart(0.333f)
            val lineaguia2=createGuidelineFromStart(0.666f)
            Box(modifier = Modifier.size(80.dp).background(Color(0xFF006341)).
            constrainAs(caja) {
           start.linkTo(parent.start)
                end.linkTo(lineaguia)
           top.linkTo(parent.top)
                bottom.linkTo(parent.bottom)
                height= Dimension.fillToConstraints
                width= Dimension.fillToConstraints
//
            })
            Box(modifier = Modifier.size(80.dp).background(Color.White).constrainAs(caja1) {
                start.linkTo(lineaguia)
                end.linkTo(lineaguia2)
                top.linkTo(parent.top)
                bottom.linkTo(parent.bottom)
                height= Dimension.fillToConstraints
                width= Dimension.fillToConstraints

            })
            Box(modifier = Modifier.size(80.dp).background(Color(0xFFCE1126)).constrainAs(caja1) {
                start.linkTo(lineaguia2)
                end.linkTo(parent.end)
                top.linkTo(parent.top)
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
