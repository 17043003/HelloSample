package com.ishizuka.android.hellosample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 表示ボタンのオブジェクトを取得
        val btClick = findViewById<Button>(R.id.btClick)
        // リスナクラスのインスタンス作成
        val listener = HelloListener()
        // 表示ボタンにリスナを設定
        btClick.setOnClickListener(listener)
    }

    // ボタンをクリックした際のリスナクラス
    private inner class HelloListener : View.OnClickListener {
        override fun onClick(view: View){
            // 名前入力欄であるEditTextオブジェクトを取得
            val input = findViewById<EditText>(R.id.etName)

            // メッセージを表示するTextViewオブジェクトを取得
            val output = findViewById<TextView>(R.id.tvOutput)

            // 入力された文字列を取得
            val inputString = input.text.toString()

            // メッセージを表示
            output.text = "${inputString}さん、こんにちは！"
        }
    }
}
