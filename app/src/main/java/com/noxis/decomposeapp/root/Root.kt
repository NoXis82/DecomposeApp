package com.noxis.decomposeapp.root

import com.arkivanov.decompose.router.stack.ChildStack
import com.arkivanov.decompose.value.Value

interface Root {

    val routerState: Value<ChildStack<*, Child>>

    fun onNextClicked()
    fun onPrevClicked()

    sealed class Child {
        class Page(val component: com.noxis.decomposeapp.page.Page) : Child()
    }
}