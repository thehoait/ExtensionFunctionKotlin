package com.example.hoaht.extensionfunctionkotlin.model

/**
 * C.
 *
 * @author HoaHT
 */
class C3 {
    fun foo() {
        println("member")
    }
}

fun C3.foo(i: Int) {
    println("extension")
}

fun Test() {
    C3().foo(1)
}