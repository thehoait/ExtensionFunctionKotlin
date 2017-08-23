package com.example.hoaht.extensionfunctionkotlin.model

/**
 * Outer.
 *
 * @author HoaHT
 */

//
//                    class Outer {
//                        private val bar: Int = 1
//                        class Nested {
//                            fun foo() = 2
//                        }
//                    }
//                    val demo = Outer.Nested().foo() // == 2



                    class Outer {
                        private val bar: Int = 1
                        inner class Nested {
                            fun foo() = bar
                        }
                    }
                    val demo = Outer().Nested().foo() // == 1