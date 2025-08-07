package com.patrickdd

class KArray<T>(val size: Int) {

    private var items: Array<Any?> = arrayOfNulls(size)

    fun get(index: Int): T {
        checkBounds(index)
        @Suppress("UNCHECKED_CAST")
        return items[index] as T
    }

    fun set(index: Int, elem: T){
        checkBounds(index)
        items[index] = elem
    }

    private fun checkBounds(index: Int){
        if (index < 0 || index >= size) {
            throw IndexOutOfBoundsException("Index: $index, but the size is fixed at $size")
        }
    }
}