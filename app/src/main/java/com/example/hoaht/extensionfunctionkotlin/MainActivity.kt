package com.example.hoaht.extensionfunctionkotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import com.example.hoaht.extensionfunctionkotlin.fragment.swap
import com.example.hoaht.extensionfunctionkotlin.fragment.text
import com.example.hoaht.extensionfunctionkotlin.fragment.toast
import com.example.hoaht.extensionfunctionkotlin.model.Animal
import com.example.hoaht.extensionfunctionkotlin.model.Dog
import com.example.hoaht.extensionfunctionkotlin.model.Pig
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object {
        val URL = "https://google.com.vn"
    }

    fun MainActivity.Companion.foo() {
        val a: Int? = null
        a.toString()
    }

    fun Any?.toString(): String {
        if (this == null) {
            return "null"
        }
        return toString()
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        print(URL)

        val tvContent: TextView = findViewById(R.id.tvTitle)
        tvContent.setText(2.3f)

        val list: MutableList<Int>? = mutableListOf(1, 2, 2, 4)
        list?.swap(1, 2)

        val list1: MutableList<String> = mutableListOf("a", "b", "c")
        list1.swap(1, 2)


        val url: String = ""
        2.square()
        tvTitle.showText(5)
//        imgContent.loadUrl(url)


        tvTitle text 3


        tvTitle.text(3)


//        imgContent loadUrl url


        val listData: List<Int> = listOf(1, 2, 3)
        listData.lastIndex

        toast("success")

//        startActivity<BaseActivity>()

        logAll()
    }


//    val Foo.bar = 1 // error: initializers are not allowed for extension properties


    val <T> List<T>.lastIndex: Int
        get() = size - 1


    fun Int.square(): Int {
        return this * this
    }

    fun MutableList<Int>.swap(index1: Int, index2: Int) {
        val temp = this[index1]
        this[index1] = this[index2]
        this[index2] = temp
    }

    fun TextView.showText(value: Int) {
        this.text = value.toString()
    }

    infix fun ImageView.loadUrl(url: String) {
        Picasso.with(context)
                .load(url)
                .into(this)
    }


    fun TextView.setText(value: Float) {
        text = value.toString()
        var day: Day = Day.SATURDAY
        day = Day.FRIDAY
    }

    enum class Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY,
        FRIDAY, SATURDAY, SUNDAY
    }


    enum class Icon(val res: Int) {
        UP(R.drawable.ic_up),
        SEARCH(R.drawable.ic_search),
        CAST(R.drawable.ic_cast)
    }

    private val TAG = MainActivity::class.java.name

    val searchIconRes = Icon.SEARCH.res

    val search: Icon = Icon.valueOf("SEARCH")
    val iconList: Array<Icon> = Icon.values()


    val searchName: String = Icon.SEARCH.name
    val searchPosition: Int = Icon.SEARCH.ordinal


    fun logAll() {
        Log.d(TAG, "logAll: " + search)
        Log.d(TAG, "logAll: " + iconList)
        Log.d(TAG, "logAll: " + searchName)
        Log.d(TAG, "logAll: " + searchPosition)
        try {
            throwException()
        } catch (e: NullPointerException) {
            Log.d(TAG, "logAll: " + e.message)
        }

    }


    fun throwException() {
        val a: Int? = null
        if (a != null) {

        } else {
            throw NullPointerException("a null")
        }

        val x: Any? = null
        val s = try {
            x as String
        } catch(e: ClassCastException) {
            null
        }

    }


//    fun Test() {
//        s = try {
//// some code
//        } catch (e: SomeException) {
//// handler
//        } finally {
//// optional finally block
//        }
//    }

    fun abc() {

        val x: Any? = null
        val s = when (x) {
            is Int -> "Int instance"
            is String -> "String instance"
            else -> throw UnsupportedOperationException("Not valid type")
        }

        val animal: Animal
        if (true) {
            animal = Dog()
        } else {
            animal = Pig()
        }


        val b = when (animal) {
            is Dog -> "dog"
            is Pig -> "Pig"
        }



    }

//    class Chicken:Animal()

}
