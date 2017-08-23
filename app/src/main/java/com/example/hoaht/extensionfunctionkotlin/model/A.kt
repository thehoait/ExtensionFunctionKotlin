package com.example.hoaht.extensionfunctionkotlin.model

/**
 * C.
 *
 * @author HoaHT
 */
                class A {
                    fun foo() {
                        print("member")
                    }
                }

                fun A.foo(i: Int) {
                    print("extension")
                }


fun abc() {
    val a = A()
    a.foo(1)
}