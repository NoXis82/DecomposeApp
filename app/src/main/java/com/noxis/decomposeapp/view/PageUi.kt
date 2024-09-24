package com.noxis.decomposeapp.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.noxis.decomposeapp.page.Page

@Composable
fun PageUi(component: Page, modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Row(
            modifier = Modifier
                .weight(1F)
                .fillMaxWidth()
        ) {
            CounterUi(
                component = component.counter,
                modifier = Modifier
                    .weight(1F)
                    .fillMaxHeight()
            )
            ItemListUi(
                component = component.itemList,
                modifier = Modifier
                    .weight(1F)
                    .fillMaxHeight()
            )
        }
        EditorUi(component = component.editor, modifier = Modifier.fillMaxWidth())
    }

}