package com.noxis.decomposeapp.itemlist

import com.arkivanov.decompose.value.MutableValue
import com.arkivanov.decompose.value.Value

class ItemListComponent : ItemList {

    private val _models = MutableValue(ItemList.Model(
        items = List(100) { "Item $it" }
    ))

    override val models: Value<ItemList.Model>
        get() = _models
}