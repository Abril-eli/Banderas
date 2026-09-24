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
            Box(modifier = Modifier.size(80.dp).background(Color.Red).constrainAs(caja) {
           start.linkTo(parent.start)
                end.linkTo(parent.end)
           top.linkTo(parent.top)
                bottom.linkTo(parent.bottom)
//
            })
            Box(modifier = Modifier.size(80.dp).background(Color.Green).constrainAs(caja1) {
                start.linkTo(caja.start)
                end.linkTo(caja.end)
                top.linkTo(parent.top)
                bottom.linkTo(caja.top)
                verticalBias=0.3f
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
