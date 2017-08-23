package com.example.hoaht.extensionfunctionkotlin.model

/**
 * Test.
 *
 * @author HoaHT
 */
open class D

class D1 : D()

open class C {
    open fun D.foo() {
        println("D.foo in C")
    }

    open fun D1.foo() {
        println("D1.foo in C")
    }
}

class C1 : C() {
    override fun D.foo() {
        println("D.foo in C1")
    }

    override fun D1.foo() {
        println("D1.foo in C1")
    }
}
