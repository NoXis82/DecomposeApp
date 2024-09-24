package com.noxis.decomposeapp

import com.arkivanov.decompose.value.MutableValue

inline fun <T : Any> MutableValue<T>.reducer(reducer: (T) -> T) {
    value = reducer(value)
}