package com.noxis.decomposeapp.counter

import com.arkivanov.decompose.value.Value

interface Counter {

    val models: Value<Model> //наблюдаемый объект/состояние

    fun onIncrementClicked()
    fun onDecrementClicked()

    data class Model(
        val count: Int = 0
    )
}