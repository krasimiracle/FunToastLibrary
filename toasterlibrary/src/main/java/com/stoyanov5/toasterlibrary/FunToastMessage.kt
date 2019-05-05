package com.stoyanov5.toasterlibrary

import android.content.Context
import android.widget.Toast

class FunToastMessage {
    fun showFunToast(c: Context, message: String) {

        Toast.makeText(c, "Woah a $message", Toast.LENGTH_SHORT).show()

    }
}