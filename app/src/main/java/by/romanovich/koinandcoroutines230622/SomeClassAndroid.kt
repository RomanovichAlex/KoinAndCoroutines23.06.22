package by.romanovich.koinandcoroutines230622

import android.content.Context

class SomeClassAndroid(private val context:Context) {
    fun print() {
        println("VVV ${context.getString(R.string.app_name)}")
    }

}