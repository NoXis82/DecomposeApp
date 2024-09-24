package com.noxis.decomposeapp.view

import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.arkivanov.decompose.extensions.compose.jetpack.subscribeAsState
import com.arkivanov.decompose.value.MutableValue
import com.arkivanov.decompose.value.Value
import com.noxis.decomposeapp.editor.Editor

@Composable
fun EditorUi(component: Editor, modifier: Modifier = Modifier) {

    val model by component.models.subscribeAsState()

    TextField(value = model.text, onValueChange = component::onTextChanged, modifier = modifier)
}

@Preview
@Composable
fun EditorUiPreview() {
    EditorUi(component = EditorPreview())
}

class EditorPreview : Editor {
    override val models: Value<Editor.Model> = MutableValue(Editor.Model(text = "Some text"))

    override fun onTextChanged(text: String) {}
}