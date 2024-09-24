package com.noxis.decomposeapp.page

import com.noxis.decomposeapp.counter.Counter
import com.noxis.decomposeapp.counter.CounterComponent
import com.noxis.decomposeapp.editor.Editor
import com.noxis.decomposeapp.editor.EditorComponent
import com.noxis.decomposeapp.itemlist.ItemList
import com.noxis.decomposeapp.itemlist.ItemListComponent

class PageComponent : Page {

    override val counter: Counter
        get() = CounterComponent()

    override val itemList: ItemList
        get() = ItemListComponent()

    override val editor: Editor
        get() = EditorComponent()
}