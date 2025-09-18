package com.example.hide_and_seek

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun clicked(view: View) {
        var textView: TextView = findViewById(R.id.textView)
        textView.setText(R.string.Motivation_message);
    }

    var counter = 0;
    fun increament(view: View) {
        counter++;
        var counter_text: TextView = findViewById(R.id.counter_text)
        counter_text.text = counter.toString()
    }

    fun decreament(view: View) {
        if (counter > 0) {
            counter--;
        }
        var _counter_text: TextView = findViewById(R.id.counter_text)
        _counter_text.text = counter.toString()
    }

    fun add(view: View){
        var n1=findViewById<EditText?>(R.id.num1).text.toString().toInt()
        var n2=findViewById<EditText?>(R.id.num2).text.toString().toInt()
        var record:TextView=findViewById(R.id.result)
        var result=n1 + n2
        record.text="Result is $result"
    }
    fun sub(view:View){
        var n1=findViewById<EditText?>(R.id.num1).text.toString().toInt()
        var n2=findViewById<EditText?>(R.id.num2).text.toString().toInt()
        var result=n1-n2
        findViewById<TextView>(R.id.result).text="Result is $result"
    }
    fun mul(view:View){
        var n1=findViewById<EditText?>(R.id.num1).text.toString().toInt()
        var n2=findViewById<EditText?>(R.id.num2).text.toString().toInt()
        var result=n1*n2
        findViewById<TextView>(R.id.result).text="Result is $result"
    }
    fun div(view:View){
        var n1=findViewById<EditText?>(R.id.num1).text.toString().toInt()
        var n2=findViewById<EditText?>(R.id.num2).text.toString().toInt()
        var result=n1/n2
        findViewById<TextView>(R.id.result).text="Result is $result"
    }


}


