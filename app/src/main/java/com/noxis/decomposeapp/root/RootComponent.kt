package com.noxis.decomposeapp.root

import android.os.Parcelable
import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.router.stack.ChildStack
import com.arkivanov.decompose.router.stack.StackNavigation
import com.arkivanov.decompose.router.stack.childStack
import com.arkivanov.decompose.router.stack.pop
import com.arkivanov.decompose.router.stack.push
import com.arkivanov.decompose.value.Value
import com.noxis.decomposeapp.page.PageComponent
import kotlinx.parcelize.Parcelize

class RootComponent(
    componentContext: ComponentContext
) : Root, ComponentContext by componentContext {

    private val navigation = StackNavigation<Config>()


    private val router = childStack(
        source = navigation,
        serializer = null,
        initialConfiguration = Config.Page(0),
        childFactory = ::child
    )

    override val routerState: Value<ChildStack<*, Root.Child>>
        get() = router

    override fun onNextClicked() {
        navigation.push(Config.Page(router.value.backStack.size + 1))
    }

    private fun child(config: Config, componentContext: ComponentContext): Root.Child =
        when (config) {
            is Config.Page -> Root.Child.Page(PageComponent())
        }

    override fun onPrevClicked() {
        navigation.pop()
    }

    private sealed class Config : Parcelable {

        @Parcelize
        data class Page(val index: Int) : Config()
    }
}