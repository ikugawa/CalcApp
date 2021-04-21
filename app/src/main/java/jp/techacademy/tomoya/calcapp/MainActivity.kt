package jp.techacademy.tomoya.calcapp

import android.R.id.edit
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (editText1.text.toString().equals("") || editText2.text.toString().equals("")) {
            val rootLayout: View = findViewById(android.R.id.content)
            Snackbar.make(rootLayout, "何か数値を入力してください", Snackbar.LENGTH_INDEFINITE)
                    .setAction("実行") {
                    }.show()
        } else if (v?.id == R.id.button1) {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("VALUE1", editText1.text.toString())
            intent.putExtra("VALUE2", editText2.text.toString())
            startActivity(intent)
        } else if (v?.id == R.id.button2) {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("VALUE3", editText1.text.toString())
            intent.putExtra("VALUE4", editText2.text.toString())
            startActivity(intent)
        } else if (v?.id == R.id.button3) {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("VALUE5", editText1.text.toString())
            intent.putExtra("VALUE6", editText2.text.toString())
            startActivity(intent)
        } else if (v?.id == R.id.button4) {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("VALUE7", editText1.text.toString())
            intent.putExtra("VALUE8", editText2.text.toString())
            startActivity(intent)
        }
    }
}

