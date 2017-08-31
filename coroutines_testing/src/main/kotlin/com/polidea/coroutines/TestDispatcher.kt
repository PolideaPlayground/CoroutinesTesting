package com.polidea.coroutines

import kotlinx.coroutines.experimental.CoroutineDispatcher
import kotlin.coroutines.experimental.CoroutineContext


class TestDispatcher : CoroutineDispatcher() {

    var startedCoroutinesQuantity = 0

    override fun dispatch(context: CoroutineContext, block: Runnable) {
        ++ startedCoroutinesQuantity
    }
}