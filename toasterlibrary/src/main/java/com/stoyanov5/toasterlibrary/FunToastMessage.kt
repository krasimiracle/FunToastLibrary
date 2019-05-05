package com.stoyanov5.toasterlibrary

import android.content.Context
import android.widget.Toast

object FunToastMessage {

    @JvmStatic fun showFunToast(context: Context, message: String) {

        Toast.makeText(context, "Woah a $message", Toast.LENGTH_SHORT).show()
    }
}