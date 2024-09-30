package com.canerture.composecomponents.ui

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun NormalText() {
    Text(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        text = "Lorem Ipsum Dolor Consectetur Adipiscing Elit, Sed Do Eiusmod.",
        fontSize = 24.sp,
        lineHeight = 32.sp,
        color = Color.Red,
        maxLines = 4,
        letterSpacing = 1.sp,
        fontWeight = FontWeight.ExtraBold,
        fontStyle = FontStyle.Italic,
        fontFamily = FontFamily.Monospace,
        textAlign = TextAlign.Center,
    )
}

@Composable
fun AnnotatedText() {
    Text(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        text = buildAnnotatedString {
            withStyle(
                style = SpanStyle(
                    color = Color.Blue,
                    fontWeight = FontWeight.Bold,
                    textDecoration = TextDecoration.Underline,
                )
            ) {
                append("Kullanım şartlarını")
            }
            append(" okudum, kabul ediyorum")
        }
    )
}

@Composable
fun TextStyleText() {
    Text(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        text = "Lorem Ipsum Dolor Consectetur Adipiscing Elit, Sed Do Eiusmod.",
        style = TextStyle(
            brush = Brush.horizontalGradient(
                colors = listOf(Color.Red, Color.Blue),
            ),
            shadow = Shadow(
                color = Color.Gray,
                offset = Offset(10f, 10f),
                blurRadius = 10f,
            ),
        )
    )
}

@Composable
fun OverflowText() {
    Text(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        text = "Lorem Ipsum Dolor Consectetur Adipiscing Elit, Sed Do Eiusmod.",
        maxLines = 1,
        overflow = TextOverflow.Ellipsis,
    )
}

@Composable
fun TextDecoration() {
    Text(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        text = "Lorem Ipsum Dolor Consectetur Adipiscing Elit, Sed Do Eiusmod.",
        textDecoration = TextDecoration.Underline,
    )
}

@Preview(showBackground = true)
@Composable
private fun TextsPreview() {
    NormalText()
}

@Preview(showBackground = true)
@Composable
private fun AnnotatedTextPreview() {
    AnnotatedText()
}

@Preview(showBackground = true)
@Composable
private fun TextStyleTextPreview() {
    TextStyleText()
}

@Preview(showBackground = true)
@Composable
private fun OverflowTextPreview() {
    OverflowText()
}

@Preview(showBackground = true)
@Composable
private fun TextDecorationPreview() {
    TextDecoration()
}