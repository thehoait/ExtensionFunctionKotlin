package com.example.hoaht.extensionfunctionkotlin.fragment

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.widget.TextView
import android.widget.Toast

/**
 * Common.
 *
 * @author HoaHT
 */

            fun Context.toast(msg: CharSequence, dur: Int = Toast.LENGTH_SHORT) {
                Toast.makeText(this, msg, dur).show()
            }

            inline fun <reified T : Activity> Activity.startActivity() {
                val intent = Intent(this, T::class.java)
                startActivity(intent)
            }

            infix fun TextView.text(value: Any) {
                text = value.toString()
            }

            fun <T> MutableList<T>.swap(index1: Int, index2: Int) {
                val temp = this[index1]
                this[index1] = this[index2]
                this[index2] = temp
            }

