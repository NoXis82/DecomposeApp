package com.noxis.decomposeapp.page

import com.noxis.decomposeapp.counter.Counter
import com.noxis.decomposeapp.editor.Editor
import com.noxis.decomposeapp.itemlist.ItemList

interface Page {

    val counter: Counter
    val itemList: ItemList
    val editor: Editor
}
