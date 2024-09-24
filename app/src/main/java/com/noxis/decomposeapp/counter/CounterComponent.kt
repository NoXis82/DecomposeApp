package com.noxis.decomposeapp.counter

import com.arkivanov.decompose.value.MutableValue
import com.arkivanov.decompose.value.Value
import com.noxis.decomposeapp.reducer

class CounterComponent : Counter {

    private val _models = MutableValue(Counter.Model())

    override val models: Value<Counter.Model>
        get() = _models

    override fun onIncrementClicked() {
        _models.reducer {
            it.copy(count = it.count + 1)
        }
    }

    override fun onDecrementClicked() {
        _models.reducer {
            it.copy(count = it.count - 1)
        }
    }
}