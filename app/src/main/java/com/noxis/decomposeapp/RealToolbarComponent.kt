package com.noxis.decomposeapp

import android.util.Log
import com.arkivanov.decompose.ComponentContext

class RealToolbarComponent(componentContext: ComponentContext) :
    ComponentContext by componentContext, ToolbarComponent {

    override fun onHintClick() {
        // some logic
        Log.d("RealToolbarComponent", "onHintClick")
    }
}