package com.noxis.decomposeapp.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.arkivanov.decompose.extensions.compose.jetpack.subscribeAsState
import com.noxis.decomposeapp.counter.Counter

@Composable
fun CounterUi(component: Counter, modifier: Modifier = Modifier) {

    val model by component.models.subscribeAsState()

    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = component::onIncrementClicked) {
            Text(text = "+")
        }
        Text(text = "Count: ${model.count}")
        Button(onClick = component::onDecrementClicked) {
            Text(text = "-")
        }
    }

}