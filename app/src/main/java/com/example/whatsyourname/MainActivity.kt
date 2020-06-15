package com.example.whatsyourname

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.activity_main.view.button


class MainActivity : AppCompatActivity() {
    //    画面が開いた時に最初にやることを書く場所
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        使うクラスを決めて名前をつける
//        val textView: TextView = findViewById(R.id.textView)
//        val editText: EditText = findViewById(R.id.editText)
//        val button: Button = findViewById(R.id.button)
//        val imageView: ImageView = findViewById(R.id.imageView)

// 「押してね」ボタンを押したら
//        button.setOnClickListener(this)
        button.setOnClickListener {
            //Todo １． 「〇〇(入力した文字)さん、こんにちは」という文字を出す
            textView.text = EditText.text.toString() + "さん、こんにちは"
            /* Todo ２．画像を出す */
            imageView.setImageResource(R.drawable.resize)
        }
    }

//ボタンが押された時にやることを書く場所
//    override fun onClick(p0: View?) {
//    //Todo １． 「〇〇(入力した文字)さん、こんにちは」という文字を出す
//    textView.text = EditText.text.toString() + "さん、こんにちは"
//    /* Todo ２．画像を出す */
//    imageView.setImageResource(R.drawable.resize)
//    }
}