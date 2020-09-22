package com.aleix.tupi_library

import android.content.Context
import android.widget.Toast

class TupiLibrary {

    fun hello(first: Int, second: Int): Int {

        val result = first + second
        return result
    }

    fun toast(context: Context, text: String) {
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show()
    }
}