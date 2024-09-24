package com.noxis.decomposeapp.editor

import com.arkivanov.decompose.value.MutableValue
import com.arkivanov.decompose.value.Value
import com.noxis.decomposeapp.reducer

class EditorComponent : Editor {

    private val _models = MutableValue(Editor.Model())

    override val models: Value<Editor.Model>
        get() = _models

    override fun onTextChanged(text: String) {
        _models.reducer { it.copy(text = text) }
    }
}