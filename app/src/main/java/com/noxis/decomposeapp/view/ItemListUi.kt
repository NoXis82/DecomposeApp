package com.noxis.decomposeapp.view

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.arkivanov.decompose.extensions.compose.jetpack.subscribeAsState
import com.noxis.decomposeapp.itemlist.ItemList

@Composable
fun ItemListUi(component: ItemList, modifier: Modifier = Modifier) {
    val model by component.models.subscribeAsState()

    LazyColumn(modifier = modifier) {
        items(model.items) {
            Text(text = it, modifier = Modifier.padding(8.dp))
        }
    }
}
