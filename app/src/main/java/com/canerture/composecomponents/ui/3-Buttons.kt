package com.canerture.composecomponents.ui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LargeFloatingActionButton
import androidx.compose.material3.MultiChoiceSegmentedButtonRow
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.SegmentedButton
import androidx.compose.material3.SegmentedButtonDefaults
import androidx.compose.material3.SingleChoiceSegmentedButtonRow
import androidx.compose.material3.SmallFloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Buttons() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp, Alignment.CenterVertically),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Filled()
        FilledTonal()
        Outlined()
        Elevated()
        ButtonWithText()
        ButtonWithIcon()
        IconTextButton()
        SingleChoiceSegmentedButton()
        MultipleChoiceSegmentedButton()
        FAB()
    }
}

@Composable
fun Filled() {
    Button(
        onClick = { /*TODO*/ },
        enabled = true,
        shape = RoundedCornerShape(100),
        elevation = ButtonDefaults.buttonElevation(
            defaultElevation = 8.dp,
        ),
        border = BorderStroke(
            width = 2.dp,
            brush = Brush.linearGradient(
                colors = listOf(Color.Red, Color.Blue),
            ),
        ),
    ) {
        Text("Filled Button")
    }
}

@Composable
fun FilledTonal() {
    FilledTonalButton(
        onClick = { /*TODO*/ },
    ) {
        Text("Filled Tonal Button")
    }
}

@Composable
private fun Outlined() {
    OutlinedButton(
        onClick = { /*TODO*/ },
    ) {
        Text("Outlined Button")
    }
}

@Composable
fun Elevated() {
    ElevatedButton(
        onClick = { /*TODO*/ },
    ) {
        Text("Elevated Button")
    }
}

@Composable
fun ButtonWithText() {
    TextButton(
        onClick = { /*TODO*/ },
    ) {
        Text("Text Button")
    }
}

@Composable
fun ButtonWithIcon() {
    IconButton(
        onClick = { /*TODO*/ },
    ) {
        Icon(
            imageVector = Icons.Default.Add,
            contentDescription = "Add",
        )
    }
}

@Composable
fun IconTextButton() {
    Button(
        onClick = { /*TODO*/ },
    ) {
        Icon(
            imageVector = Icons.Default.Add,
            contentDescription = "Add",
        )
        Text("Add")
    }
}

@Composable
fun SingleChoiceSegmentedButton() {
    var checkedItem by remember { mutableIntStateOf(0) }
    val options = listOf("Favorites", "Trending", "Saved")
    SingleChoiceSegmentedButtonRow {
        options.forEachIndexed { index, option ->
            SegmentedButton(
                onClick = {
                    checkedItem = index
                },
                selected = checkedItem == index,
                shape = SegmentedButtonDefaults.itemShape(
                    index = index,
                    count = options.size,
                ),
            ) {
                Text(option)
            }
        }
    }
}

@Composable
fun MultipleChoiceSegmentedButton() {
    val checkedItems = remember { mutableStateListOf<Int>() }
    val options = listOf("Favorites", "Trending", "Saved")
    MultiChoiceSegmentedButtonRow {
        options.forEachIndexed { index, option ->
            SegmentedButton(
                onCheckedChange = {
                    if (index in checkedItems) {
                        checkedItems.remove(index)
                    } else {
                        checkedItems.add(index)
                    }
                },
                checked = index in checkedItems,
                shape = SegmentedButtonDefaults.itemShape(
                    index = index,
                    count = options.size,
                ),
            ) {
                Text(option)
            }
        }
    }
}

@Composable
fun FAB() {
    Row(
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        LargeFloatingActionButton(
            onClick = { /*TODO*/ },
        ) {
            Icon(
                imageVector = Icons.Default.Add,
                contentDescription = "Add",
            )
        }

        FloatingActionButton(
            onClick = { /*TODO*/ },
        ) {
            Icon(
                imageVector = Icons.Default.Add,
                contentDescription = "Add",
            )
        }

        SmallFloatingActionButton(
            onClick = { /*TODO*/ },
        ) {
            Icon(
                imageVector = Icons.Default.Add,
                contentDescription = "Add",
            )
        }

        ExtendedFloatingActionButton(
            onClick = { /*TODO*/ },
        ) {
            Icon(
                imageVector = Icons.Default.Add,
                contentDescription = "Add",
            )
            Text("Add")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ButtonsPreview() {
    Buttons()
}