package jp.techacademy.tomoya.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val value1 = intent.getStringExtra("VALUE1")
        val value2 = intent.getStringExtra("VALUE2")
        val value3 = intent.getStringExtra("VALUE3")
        val value4 = intent.getStringExtra("VALUE4")
        val value5 = intent.getStringExtra("VALUE5")
        val value6 = intent.getStringExtra("VALUE6")
        val value7 = intent.getStringExtra("VALUE7")
        val value8 = intent.getStringExtra("VALUE8")

        if (value1 != null) {
            if (value2 != null) {
                textView.text = "${value1.toInt() + value2.toInt()}"
            }}
        if (value3 != null) {
            if (value4 != null) {
                textView.text = "${value3.toInt() - value4.toInt()}"
            }}
        if (value5 != null) {
            if (value6 != null) {
                textView.text = "${value5.toInt() * value6.toInt()}"
            }}
        if (value7 != null) {
            if (value8 != null) {
                textView.text = "${value7.toInt() / value8.toInt()}"
            }}
                    }
                }



