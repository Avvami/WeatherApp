package com.personal.weathering.presentation.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MenuDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.personal.weathering.domain.models.DropdownItem
import com.personal.weathering.presentation.ui.theme.weatheringBlue
import com.personal.weathering.presentation.ui.theme.weatheringDarkBlue

@Composable
fun CustomDropdownMenu(
    expanded: Boolean,
    onDismissRequest: () -> Unit,
    dropDownItems: List<DropdownItem?>
) {
    MaterialTheme(shapes = MaterialTheme.shapes.copy(extraSmall = RoundedCornerShape(12.dp))) {
        DropdownMenu(
            expanded = expanded,
            onDismissRequest = onDismissRequest,
            modifier = Modifier.background(weatheringDarkBlue)
        ) {
            dropDownItems.forEachIndexed { index, dropDownItem ->
                dropDownItem?.let { item ->
                    DropdownMenuItem(
                        leadingIcon = {
                            if (item.selected == true) {
                                item.iconRes?.let { iconRes ->
                                    Icon(painter = painterResource(id = iconRes), contentDescription = "Dropdown item icon")
                                }
                            }
                        },
                        text = { Text(text = stringResource(id = item.textRes)) },
                        onClick = { item.onItemClick() },
                        colors = MenuDefaults.itemColors(textColor = weatheringBlue, leadingIconColor = weatheringBlue)
                    )
                    if (index != dropDownItems.lastIndex) {
                        HorizontalDivider(
                            modifier = if (item.iconRes != null) Modifier.padding(start = 48.dp, end = 8.dp) else Modifier,
                            color = weatheringBlue
                        )
                    }
                }
            }
        }
    }
}
