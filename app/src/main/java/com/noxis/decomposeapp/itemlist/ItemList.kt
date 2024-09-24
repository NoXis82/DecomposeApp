package com.noxis.decomposeapp.itemlist

import com.arkivanov.decompose.value.Value

interface ItemList {

    val models: Value<Model>

    data class Model(
        val items: List<String>
    )
}