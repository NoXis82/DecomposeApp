package com.noxis.decomposeapp.editor

import com.arkivanov.decompose.value.Value

interface Editor {

    val models: Value<Model>

    fun onTextChanged(text: String)

    data class Model(
        val text: String = ""
    )
}