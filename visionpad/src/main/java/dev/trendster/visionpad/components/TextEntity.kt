package dev.trendster.visionpad.components

import androidx.compose.material.LocalTextStyle
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.sp
import dev.trendster.visionpad.internal.toColor
import dev.trendster.visionpad.model.Element


/**
 * A Composable function for rendering a text entity using Jetpack Compose.
 *
 * @param modifier Modifier for styling and layout adjustments.
 * @param element The data class representing the properties of the text entity.
 */

@Composable
fun TextEntity(
    modifier: Modifier = Modifier,
    element: Element
) {
    val string = element.text ?: "Demo Text"
    val textSize = element.fontSize ?: 30F
    val textColor = element.textColor.toColor()
    val fontFamily: FontFamily = FontFamily.Default

    // Use the Text composable to render the text entity.
    Text(
        text = string,
        fontSize = textSize.sp,
        color = textColor,
        fontFamily = fontFamily,
        style = LocalTextStyle.current.merge(TextStyle(color = Color.Black, fontSize = textSize.sp,)),
        modifier = modifier
    )
}