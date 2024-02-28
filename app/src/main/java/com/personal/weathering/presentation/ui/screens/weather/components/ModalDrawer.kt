package com.personal.weathering.presentation.ui.screens.weather.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.SegmentedButton
import androidx.compose.material3.SegmentedButtonDefaults
import androidx.compose.material3.SingleChoiceSegmentedButtonRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.personal.weathering.R
import com.personal.weathering.presentation.state.CurrentCityState
import com.personal.weathering.presentation.ui.theme.weatheringBlue
import com.personal.weathering.presentation.ui.theme.weatheringDarkBlue

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ModalDrawer(
    currentCityState: () -> CurrentCityState
) {
    ModalDrawerSheet(
        drawerContentColor = weatheringDarkBlue,
        drawerContainerColor = weatheringBlue
    ) {
        Spacer(modifier = Modifier.height(16.dp))
        Column(
            verticalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier.padding(horizontal = 16.dp)
        ) {
            Text(text = stringResource(id = R.string.measurement_units), style = MaterialTheme.typography.titleMedium)
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = stringResource(id = R.string.temperature_units), style = MaterialTheme.typography.bodyLarge)
                Spacer(modifier = Modifier.width(8.dp))
                SingleChoiceSegmentedButtonRow {
                    SegmentedButton(
                        selected = true,
                        onClick = { /*TODO*/ },
                        shape = RoundedCornerShape(topStart = 28.dp, bottomStart = 28.dp),
                        label = { Text(text = stringResource(id = R.string.celsius_unit)) },
                        colors = SegmentedButtonDefaults.colors(
                            activeContentColor = weatheringBlue,
                            activeContainerColor = weatheringDarkBlue,
                            activeBorderColor = weatheringDarkBlue,
                            inactiveContentColor = weatheringDarkBlue,
                            inactiveContainerColor = Color.Transparent,
                            inactiveBorderColor = weatheringDarkBlue
                        ),
                        icon = {}
                    )
                    SegmentedButton(
                        selected = false,
                        onClick = { /*TODO*/ },
                        shape = RoundedCornerShape(topEnd = 28.dp, bottomEnd = 28.dp),
                        label = { Text(text = stringResource(id = R.string.fahrenheit_unit)) },
                        colors = SegmentedButtonDefaults.colors(
                            activeContentColor = weatheringBlue,
                            activeContainerColor = weatheringDarkBlue,
                            activeBorderColor = weatheringDarkBlue,
                            inactiveContentColor = weatheringDarkBlue,
                            inactiveContainerColor = Color.Transparent,
                            inactiveBorderColor = weatheringDarkBlue
                        ),
                        icon = {}
                    )
                }
            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = stringResource(id = R.string.wind_speed_units), style = MaterialTheme.typography.bodyLarge)
                Spacer(modifier = Modifier.width(8.dp))
                SingleChoiceSegmentedButtonRow {
                    SegmentedButton(
                        selected = false,
                        onClick = { /*TODO*/ },
                        shape = RoundedCornerShape(topStart = 28.dp, bottomStart = 28.dp),
                        label = { Text(text = stringResource(id = R.string.m_per_second_unit)) },
                        colors = SegmentedButtonDefaults.colors(
                            activeContentColor = weatheringBlue,
                            activeContainerColor = weatheringDarkBlue,
                            activeBorderColor = weatheringDarkBlue,
                            inactiveContentColor = weatheringDarkBlue,
                            inactiveContainerColor = Color.Transparent,
                            inactiveBorderColor = weatheringDarkBlue
                        ),
                        icon = {}
                    )
                    SegmentedButton(
                        selected = true,
                        onClick = { /*TODO*/ },
                        shape = RoundedCornerShape(topEnd = 28.dp, bottomEnd = 28.dp),
                        label = { Text(text = stringResource(id = R.string.km_per_hour_unit)) },
                        colors = SegmentedButtonDefaults.colors(
                            activeContentColor = weatheringBlue,
                            activeContainerColor = weatheringDarkBlue,
                            activeBorderColor = weatheringDarkBlue,
                            inactiveContentColor = weatheringDarkBlue,
                            inactiveContainerColor = Color.Transparent,
                            inactiveBorderColor = weatheringDarkBlue
                        ),
                        icon = {}
                    )
                }
            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = stringResource(id = R.string.pressure_units), style = MaterialTheme.typography.bodyLarge)
                Spacer(modifier = Modifier.width(8.dp))
                SingleChoiceSegmentedButtonRow {
                    SegmentedButton(
                        selected = false,
                        onClick = { /*TODO*/ },
                        shape = RoundedCornerShape(topStart = 28.dp, bottomStart = 28.dp),
                        label = { Text(text = stringResource(id = R.string.mmHg_unit)) },
                        colors = SegmentedButtonDefaults.colors(
                            activeContentColor = weatheringBlue,
                            activeContainerColor = weatheringDarkBlue,
                            activeBorderColor = weatheringDarkBlue,
                            inactiveContentColor = weatheringDarkBlue,
                            inactiveContainerColor = Color.Transparent,
                            inactiveBorderColor = weatheringDarkBlue
                        ),
                        icon = {}
                    )
                    SegmentedButton(
                        selected = true,
                        onClick = { /*TODO*/ },
                        shape = RoundedCornerShape(topEnd = 28.dp, bottomEnd = 28.dp),
                        label = { Text(text = stringResource(id = R.string.hPa_unit)) },
                        colors = SegmentedButtonDefaults.colors(
                            activeContentColor = weatheringBlue,
                            activeContainerColor = weatheringDarkBlue,
                            activeBorderColor = weatheringDarkBlue,
                            inactiveContentColor = weatheringDarkBlue,
                            inactiveContainerColor = Color.Transparent,
                            inactiveBorderColor = weatheringDarkBlue
                        ),
                        icon = {}
                    )
                }
            }
        }
        Spacer(modifier = Modifier.height(16.dp))
        Column(
            verticalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier.padding(horizontal = 16.dp)
        ) {
            Text(text = stringResource(id = R.string.air_quality_index), style = MaterialTheme.typography.titleMedium)
            SingleChoiceSegmentedButtonRow(
                modifier = Modifier.fillMaxWidth()
            ) {
                SegmentedButton(
                    selected = false,
                    onClick = { /*TODO*/ },
                    shape = RoundedCornerShape(topStart = 28.dp, bottomStart = 28.dp),
                    label = { Text(text = stringResource(id = R.string.european_aqi)) },
                    colors = SegmentedButtonDefaults.colors(
                        activeContentColor = weatheringBlue,
                        activeContainerColor = weatheringDarkBlue,
                        activeBorderColor = weatheringDarkBlue,
                        inactiveContentColor = weatheringDarkBlue,
                        inactiveContainerColor = Color.Transparent,
                        inactiveBorderColor = weatheringDarkBlue
                    ),
                    icon = {}
                )
                SegmentedButton(
                    selected = true,
                    onClick = { /*TODO*/ },
                    shape = RoundedCornerShape(topEnd = 28.dp, bottomEnd = 28.dp),
                    label = { Text(text = stringResource(id = R.string.us_aqi)) },
                    colors = SegmentedButtonDefaults.colors(
                        activeContentColor = weatheringBlue,
                        activeContainerColor = weatheringDarkBlue,
                        activeBorderColor = weatheringDarkBlue,
                        inactiveContentColor = weatheringDarkBlue,
                        inactiveContainerColor = Color.Transparent,
                        inactiveBorderColor = weatheringDarkBlue
                    ),
                    icon = {}
                )
            }
        }
        Spacer(modifier = Modifier.height(16.dp))
        Column(
            verticalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier.padding(horizontal = 16.dp)
        ) {
            Text(text = stringResource(id = R.string.my_cities), style = MaterialTheme.typography.titleMedium)
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(MaterialTheme.shapes.large)
                    .background(weatheringDarkBlue)
                    .padding(16.dp)
            ) {
                Column {
                    Text(
                        text = stringResource(id = R.string.current),
                        style = MaterialTheme.typography.bodySmall,
                        color = weatheringBlue
                    )
                    Text(
                        text = currentCityState().name,
                        style = MaterialTheme.typography.titleMedium,
                        color = weatheringBlue
                    )
                }
            }
        }
    }
}