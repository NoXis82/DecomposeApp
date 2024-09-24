package com.noxis.decomposeapp.view

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.arkivanov.decompose.extensions.compose.jetpack.stack.Children
import com.noxis.decomposeapp.root.Root

@Composable
fun RootUi(component: Root) {
    Column(modifier = Modifier.fillMaxSize()) {
        Row(modifier = Modifier.fillMaxWidth()) {
            IconButton(onClick = component::onPrevClicked) {
                Icon(imageVector = Icons.AutoMirrored.Filled.ArrowBack, contentDescription = null)
            }
            Box(modifier = Modifier.weight(1F))
            IconButton(onClick = component::onNextClicked) {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.ArrowForward,
                    contentDescription = null
                )
            }
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1F)
        ) {
            Children(stack = component.routerState) {
                when (val child = it.instance) {
                    is Root.Child.Page -> {
                        PageUi(component = child.component, modifier = Modifier.fillMaxSize())
                    }
                }
            }
        }
    }
}