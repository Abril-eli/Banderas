package Screens
import androidx.annotation.ColorRes
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.example.banderas.R

@Composable
    fun BanderaScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize()
    )
    {
        Row() {
            repeat(29) { i ->
                pixel(colorResource(id = R.color.morado1))
            }
        }
        Row() {
            repeat(29) { i ->
                pixel(colorResource(id = R.color.morado1))
            }
        }
        Row() {
            repeat(29) { i ->
                pixel(colorResource(id = R.color.morado1))
            }
        }
        Row() {
            repeat(7) { i ->
                pixel(colorResource(id = R.color.morado1))
            }
            repeat(7) { i ->
                pixel(colorResource(id = R.color.verdecon))
            }
            repeat(2) { i ->
                pixel(colorResource(id = R.color.morado1))
            }

            repeat(6) { i ->
                pixel(colorResource(id = R.color.verdecon))
            }
            repeat(7) { i ->
                pixel(colorResource(id = R.color.morado1))
            }
        }
        Row() {
            repeat(6) { i ->
                pixel(colorResource(id = R.color.morado1))
            }
            repeat(1) { i ->
                pixel(colorResource(id = R.color.verdecon))
            }
            repeat(7) { i ->
                pixel(colorResource(id = R.color.verdere))
            }
            repeat(2) { i ->
                pixel(colorResource(id = R.color.verdecon))
            }
            repeat(6) { i ->
                pixel(colorResource(id = R.color.verdere))
            }
            repeat(1) { i ->
                pixel(colorResource(id = R.color.verdecon))
            }
            repeat(6) { i ->
                pixel(colorResource(id = R.color.morado1))
            }
        }
        Row() {
            repeat(5) { i ->
                pixel(colorResource(id = R.color.morado1))
            }
            repeat(1) { i ->
                pixel(colorResource(id = R.color.verdecon))
            }
            repeat(3) { i ->
                pixel(colorResource(id = R.color.verdere))
            }
            repeat(5) { i ->
                pixel(colorResource(id = R.color.verdecon))
            }
            pixel(colorResource(id = R.color.verdere))
            pixel(colorResource(id = R.color.verdecon))
            repeat(6) { i ->
                pixel(colorResource(id = R.color.verdere))
            }
            pixel(colorResource(id = R.color.verdecon))
            repeat(6) { i ->
                pixel(colorResource(id = R.color.morado1))
            }

        }
        Row() {
            repeat(4) { i ->
                pixel(colorResource(id = R.color.morado1))
            }
            pixel(colorResource(id = R.color.verdecon))
            repeat(2) { i ->
                pixel(colorResource(id = R.color.verdere))
            }
            repeat(2) { i ->
                pixel(colorResource(id = R.color.verdecon))
            }
            repeat(5) { i ->
                pixel(colorResource(id = R.color.verdere))
            }
            repeat(2) { i ->
                pixel(colorResource(id = R.color.verdecon))
            }
            pixel(colorResource(id = R.color.verdere))
            repeat(7) { i ->
                pixel(colorResource(id = R.color.verdecon))
            }
            repeat(5) { i ->
                pixel(colorResource(id = R.color.morado1))
            }
        }
        Row {
            repeat(4) { pixel(colorResource(id = R.color.morado1)) }
            pixel(colorResource(id = R.color.verdecon))

            repeat(7) { pixel(colorResource(id = R.color.verdere)) }
            repeat(2) { pixel(colorResource(id = R.color.verdecon)) }

            repeat(2) { pixel(colorResource(id = R.color.verdere)) }
            pixel(colorResource(id = R.color.verdecon))
            repeat(7) { pixel(colorResource(id = R.color.verdere)) }
            pixel(colorResource(id = R.color.verdecon))
            repeat(4) { pixel(colorResource(id = R.color.morado1)) }
        }
        Row {
            repeat(3) { pixel(colorResource(id = R.color.morado1)) }
            pixel(colorResource(id = R.color.verdecon))
            repeat(6) { pixel(colorResource(id = R.color.verdere)) }
            repeat(2) { pixel(colorResource(id = R.color.verdecon)) }
            repeat(5) { pixel(colorResource(id = R.color.verdere)) }
            pixel(colorResource(id = R.color.verdecon))
            repeat(7) { pixel(colorResource(id = R.color.verdecon)) }
            repeat(2) { pixel(colorResource(id = R.color.morado1)) }
        }
        Row {
            repeat(2) { pixel(colorResource(id = R.color.morado1)) }
            pixel(colorResource(id = R.color.verdecon))
            repeat(5) { pixel(colorResource(id = R.color.verdere)) }
            repeat(2) { pixel(colorResource(id = R.color.verdecon)) }
            repeat(8) { pixel(colorResource(id = R.color.verdere)) }
            pixel(colorResource(id = R.color.verdecon))
            repeat(6) { pixel(colorResource(id = R.color.verdere)) }
            repeat(2) { pixel(colorResource(id = R.color.verdecon)) }
            repeat(2) { pixel(colorResource(id = R.color.verdecon)) }

        }
        Row {
            repeat(1) { pixel(colorResource(id = R.color.morado1)) }
            pixel(colorResource(id = R.color.verdecon))
            repeat(5) { pixel(colorResource(id = R.color.verdere)) }
            pixel(colorResource(id = R.color.verdecon))
            repeat(3) { pixel(colorResource(id = R.color.verdere)) }
            repeat(3) { pixel(Color.White) }
            repeat(2) { pixel(Color.Black) }
            pixel(Color.White)
            pixel(colorResource(id = R.color.verdere))
            pixel(colorResource(id = R.color.verdecon))
            pixel(colorResource(id = R.color.verdere))
            repeat(3) { pixel(Color.White) }
            repeat(2) { pixel(Color.Black) }
            repeat(4) { pixel(colorResource(id = R.color.verdere)) }
        }
        Row {
            pixel(colorResource(id = R.color.morado1))
            repeat(2) { pixel(colorResource(id = R.color.verdere)) }
            pixel(colorResource(id = R.color.verdecon))
            repeat(7) { pixel(colorResource(id = R.color.verdere)) }

            repeat(2) { pixel(Color.White) }
            pixel(Color.Black)
            repeat(2) { pixel(Color.White) }
            pixel(Color.Black)
            pixel(Color.White)

            pixel(colorResource(id = R.color.verdecon))

            repeat(2) { pixel(colorResource(id = R.color.verdere)) }

            repeat(2) { pixel(Color.White) }
            pixel(Color.Black)
            repeat(2) { pixel(Color.White) }
            pixel(Color.Black)
            pixel(Color.White)

            pixel(colorResource(id = R.color.verdecon))

            repeat(2) { pixel(colorResource(id = R.color.verdere)) }

            repeat(2) { pixel(colorResource(id = R.color.morado1)) }
        }
        Row {
            pixel(colorResource(id = R.color.morado1))
            repeat(2) { pixel(colorResource(id = R.color.verdere)) }
            pixel(colorResource(id = R.color.verdecon))
            repeat(6) { pixel(colorResource(id = R.color.verdere)) }

            repeat(2) { pixel(Color.White) }
            pixel(Color.Black)
            repeat(2) { pixel(Color.White) }
            pixel(Color.Black)
            pixel(Color.White)

            pixel(colorResource(id = R.color.verdecon))

            repeat(2) { pixel(colorResource(id = R.color.verdere)) }

            repeat(2) { pixel(Color.White) }
            pixel(Color.Black)
            repeat(2) { pixel(Color.White) }
            pixel(Color.Black)
            pixel(Color.White)

            pixel(colorResource(id = R.color.verdecon))
            pixel(colorResource(id = R.color.verdere))

            repeat(2) { pixel(colorResource(id = R.color.morado1)) }
        }
        Row {
            pixel(colorResource(id = R.color.morado1))

            repeat(3) { pixel(colorResource(id = R.color.verdere)) }

            pixel(colorResource(id = R.color.verdecon))

            repeat(4) { pixel(colorResource(id = R.color.verdere)) }

            repeat(2) { pixel(Color.White) }
            repeat(3) { pixel(Color.Black) }
            pixel(Color.White)

            pixel(colorResource(id = R.color.verdecon))
            pixel(Color.Cyan)
            pixel(colorResource(id = R.color.verdecon))

            repeat(2) { pixel(Color.White) }
            repeat(3) { pixel(Color.Black) }
            pixel(Color.White)

            pixel(colorResource(id = R.color.verdecon))

            repeat(2) { pixel(colorResource(id = R.color.verdere)) }

            repeat(2) { pixel(colorResource(id = R.color.morado1)) }
        }
        Row {
            pixel(colorResource(id = R.color.morado1))

            repeat(12) { pixel(colorResource(id = R.color.verdere)) }

            pixel(colorResource(id = R.color.verdecon))

            repeat(2) { pixel(colorResource(id = R.color.verdere)) }

            repeat(4) { pixel(Color.Black) }

            pixel(colorResource(id = R.color.celeste))

            repeat(3) { pixel(colorResource(id = R.color.verdecon)) }

            repeat(4) { pixel(Color.Black) }

            repeat(2) { pixel(colorResource(id = R.color.celeste)) }

            pixel(colorResource(id = R.color.verdecon))

            repeat(2) { pixel(colorResource(id = R.color.verdere)) }

            repeat(2) { pixel(colorResource(id = R.color.morado1)) }
        }
        Row {
            pixel(colorResource(id = R.color.morado1))

            repeat(14) { pixel(colorResource(id = R.color.verdere)) }

            repeat(3) { pixel(colorResource(id = R.color.celeste)) }

            pixel(colorResource(id = R.color.verdecon))

            repeat(5) { pixel(colorResource(id = R.color.verdere)) }

            repeat(3) { pixel(colorResource(id = R.color.celeste)) }

            repeat(5) { pixel(colorResource(id = R.color.verdere)) }

            pixel(colorResource(id = R.color.verdecon))

            repeat(2) { pixel(colorResource(id = R.color.morado1)) }
        }
        Row {
            pixel(colorResource(id = R.color.morado1))

            repeat(12) { pixel(colorResource(id = R.color.verdere)) }

            pixel(colorResource(id = R.color.celeste))

            repeat(2) { pixel(colorResource(id = R.color.verdecon)) }

            repeat(4) { pixel(colorResource(id = R.color.verdere)) }

            pixel(colorResource(id = R.color.celeste))

            repeat(2) { pixel(colorResource(id = R.color.verdecon)) }

            repeat(6) { pixel(colorResource(id = R.color.verdere)) }

            pixel(colorResource(id = R.color.morado1))
            pixel(colorResource(id = R.color.morado1))
        }
        Row {
            pixel(colorResource(id = R.color.morado1))

            repeat(12) { pixel(colorResource(id = R.color.verdere)) }

            pixel(colorResource(id = R.color.celeste))

            repeat(2) { pixel(colorResource(id = R.color.verdere)) }

            repeat(5) { pixel(colorResource(id = R.color.verdere)) }

            pixel(colorResource(id = R.color.celeste))

            repeat(2) { pixel(colorResource(id = R.color.verdere)) }

            repeat(7) { pixel(colorResource(id = R.color.verdere)) }

            pixel(colorResource(id = R.color.verdecon))

            pixel(colorResource(id = R.color.morado1))
            pixel(colorResource(id = R.color.morado1))
        }
        Row {
            pixel(colorResource(id = R.color.morado1))

            repeat(12) { pixel(colorResource(id = R.color.verdere)) }

            pixel(colorResource(id = R.color.celeste))

            repeat(3) { pixel(colorResource(id = R.color.verdere)) }

            repeat(4) { pixel(colorResource(id = R.color.verdere)) }

            pixel(colorResource(id = R.color.celeste))

            repeat(3) { pixel(colorResource(id = R.color.verdere)) }

            repeat(6) { pixel(colorResource(id = R.color.verdere)) }

            pixel(colorResource(id = R.color.verdecon))

            pixel(colorResource(id = R.color.morado1))
            pixel(colorResource(id = R.color.morado1))
        }
        Row {
            pixel(colorResource(id = R.color.morado1))

            repeat(13) { pixel(colorResource(id = R.color.verdere)) }

            pixel(colorResource(id = R.color.celeste))

            repeat(4) { pixel(colorResource(id = R.color.verdere)) }

            repeat(3) { pixel(colorResource(id = R.color.verdere)) }

            pixel(colorResource(id = R.color.celeste))

            repeat(4) { pixel(colorResource(id = R.color.verdere)) }

            repeat(5) { pixel(colorResource(id = R.color.verdere)) }

            pixel(colorResource(id = R.color.verdecon))
        }
        Row {
            pixel(colorResource(id = R.color.morado1))

            repeat(10) { pixel(colorResource(id = R.color.verdere)) }

            pixel(colorResource(id = R.color.verdecon))

            repeat(6) { pixel(colorResource(id = R.color.verdere)) }

            pixel(colorResource(id = R.color.celeste))

            repeat(7) { pixel(colorResource(id = R.color.verdere)) }

            pixel(colorResource(id = R.color.celeste))

            repeat(5) { pixel(colorResource(id = R.color.verdere)) }

            pixel(colorResource(id = R.color.verdecon))

            repeat(2) { pixel(colorResource(id = R.color.morado1)) }
        }

        Row {
            pixel(colorResource(id = R.color.morado1))
            repeat(9) { pixel(colorResource(id = R.color.verdere)) }
            repeat(9) { pixel(colorResource(id = R.color.marron)) }
            pixel(colorResource(id = R.color.verdere))
            pixel(colorResource(id = R.color.celeste))
            repeat(16) { pixel(colorResource(id = R.color.verdere)) }
            pixel(colorResource(id = R.color.verdecon))
            repeat(2) { pixel(colorResource(id = R.color.morado1)) }
        }
        Row {
            pixel(colorResource(id = R.color.morado1))
            repeat(8) { pixel(colorResource(id = R.color.verdere)) }
            pixel(colorResource(id = R.color.marron))
            repeat(10) { pixel(colorResource(id = R.color.marron)) }
            pixel(colorResource(id = R.color.marron))
            pixel(colorResource(id = R.color.celeste))
            repeat(16) { pixel(colorResource(id = R.color.marron)) }
            pixel(colorResource(id = R.color.marron))
            repeat(2) { pixel(colorResource(id = R.color.morado1)) }
        }
        Row {
            pixel(colorResource(id = R.color.morado1))
            repeat(8) { pixel(colorResource(id = R.color.verdere)) }
            repeat(10) { pixel(colorResource(id = R.color.marron)) }
            pixel(colorResource(id = R.color.verdere))
            pixel(colorResource(id = R.color.celeste))
            repeat(16) { pixel(colorResource(id = R.color.verdere)) }
            pixel(colorResource(id = R.color.marron))
            repeat(3) { pixel(colorResource(id = R.color.morado1)) }
        }
        Row {
            pixel(colorResource(id = R.color.morado1))

            repeat(8) { pixel(colorResource(id = R.color.verdere)) }

            pixel(colorResource(id = R.color.marron))
            repeat(10) { pixel(colorResource(id = R.color.marron)) }
            pixel(colorResource(id = R.color.marron))

            pixel(colorResource(id = R.color.celeste))

            repeat(15) { pixel(colorResource(id = R.color.marron)) }

            pixel(colorResource(id = R.color.marron))

            repeat(3) { pixel(colorResource(id = R.color.morado1)) }
        }
        Row {
            repeat(8) { pixel(colorResource(id = R.color.verdere)) }

            pixel(colorResource(id = R.color.verdecon))

            repeat(2) { pixel(colorResource(id = R.color.verdere)) }

            pixel(colorResource(id = R.color.verdecon))

            repeat(6) { pixel(colorResource(id = R.color.verdere)) }

            pixel(colorResource(id = R.color.verdecon))

            repeat(11) { pixel(colorResource(id = R.color.verdere)) }

            repeat(2) { pixel(colorResource(id = R.color.verdecon)) }

            repeat(7) { pixel(colorResource(id = R.color.morado1)) }
        }
        Row {
            repeat(10) { pixel(colorResource(id = R.color.verdere)) }

            repeat(2) { pixel(colorResource(id = R.color.verdecon)) }

            repeat(12) { pixel(colorResource(id = R.color.verdere)) }

            pixel(colorResource(id = R.color.azul))

            repeat(2) { pixel(colorResource(id = R.color.azul)) }

            repeat(2) { pixel(colorResource(id = R.color.verdecon)) }

            repeat(8) { pixel(colorResource(id = R.color.morado1)) }
        }
        Row {
            repeat(12) { pixel(colorResource(id = R.color.verdere)) }

            repeat(12) { pixel(colorResource(id = R.color.verdere)) }

            repeat(4) { pixel(colorResource(id = R.color.azul)) }

            repeat(7) { pixel(colorResource(id = R.color.morado1)) }
        }
        Row {
            repeat(4) { pixel(colorResource(id = R.color.azul)) }

            repeat(10) { pixel(colorResource(id = R.color.verdere)) }

            pixel(colorResource(id = R.color.verdecon))

            repeat(11) { pixel(colorResource(id = R.color.verdere)) }

            repeat(5) { pixel(colorResource(id = R.color.azul)) }

            repeat(9) { pixel(colorResource(id = R.color.morado1)) }
        }
        Row {
            repeat(5) { pixel(colorResource(id = R.color.azul)) }

            repeat(8) { pixel(colorResource(id = R.color.verdere)) }

            pixel(colorResource(id = R.color.verdecon))

            repeat(10) { pixel(colorResource(id = R.color.verdere)) }

            repeat(6) { pixel(colorResource(id = R.color.azul)) }

            repeat(10) { pixel(colorResource(id = R.color.morado1)) }
        }
        Row {
            repeat(6) { pixel(colorResource(id = R.color.azul)) }

            repeat(6) { pixel(colorResource(id = R.color.verdere)) }

            pixel(colorResource(id = R.color.verdecon))

            repeat(9) { pixel(colorResource(id = R.color.verdere)) }

            repeat(7) { pixel(colorResource(id = R.color.azul)) }

            repeat(11) { pixel(colorResource(id = R.color.morado1)) }
        }
        Row {
            repeat(7) { pixel(colorResource(id = R.color.azul)) }

            repeat(5) { pixel(colorResource(id = R.color.verdere)) }

            pixel(colorResource(id = R.color.verdecon))

            repeat(7) { pixel(colorResource(id = R.color.verdere)) }

            repeat(8) { pixel(colorResource(id = R.color.azul)) }

            repeat(12) { pixel(colorResource(id = R.color.morado1)) }
        }
        Row {
            repeat(8) { pixel(colorResource(id = R.color.azul)) }
            repeat(4) { pixel(colorResource(id = R.color.verdere)) }
            pixel(colorResource(id = R.color.verdecon))
            repeat(6) { pixel(colorResource(id = R.color.verdere)) }
            repeat(9) { pixel(colorResource(id = R.color.azul)) }
            repeat(13) { pixel(colorResource(id = R.color.morado1)) }
        }
        Row {
            repeat(9) { pixel(colorResource(id = R.color.azul)) }

            repeat(3) { pixel(colorResource(id = R.color.verdere)) }

            pixel(colorResource(id = R.color.verdecon))

            repeat(5) { pixel(colorResource(id = R.color.verdere)) }

            repeat(10) { pixel(colorResource(id = R.color.azul)) }

            repeat(14) { pixel(colorResource(id = R.color.morado1)) }
        }
        Row {
            repeat(10) { pixel(colorResource(id = R.color.azul)) }

            repeat(2) { pixel(colorResource(id = R.color.verdere)) }

            pixel(colorResource(id = R.color.verdecon))

            repeat(4) { pixel(colorResource(id = R.color.verdere)) }

            repeat(11) { pixel(colorResource(id = R.color.azul)) }

            repeat(15) { pixel(colorResource(id = R.color.morado1)) }
        }
        Row {
            repeat(11) { pixel(colorResource(id = R.color.azul)) }

            pixel(colorResource(id = R.color.verdere))
            pixel(colorResource(id = R.color.verdecon))
            repeat(3) { pixel(colorResource(id = R.color.verdere)) }

            repeat(12) { pixel(colorResource(id = R.color.azul)) }

            repeat(16) { pixel(colorResource(id = R.color.morado1)) }
        }




    }
}

@Composable
fun pixel (color:Color){
    Box(Modifier.size(15.dp).background(color))
}
@Preview(showBackground = true)
    @Composable
    fun BanderaPreview() {
        BanderaScreen(modifier = Modifier.fillMaxSize())
    }
