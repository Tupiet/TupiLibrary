package com.aleix.tupi_library

import android.content.Context
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class TupiLibrary {

    fun toast(context: Context, text: String) {
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show()
    }

    fun alert(context: Context, title: String, message: String) {
        val builder = AlertDialog.Builder(context)
        builder.setTitle(title)
        builder.setMessage(message)

        builder.setNeutralButton("Ok") { dialog, which ->

        }
        builder.show()
    }
}