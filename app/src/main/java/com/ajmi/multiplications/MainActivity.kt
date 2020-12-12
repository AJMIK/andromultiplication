package com.ajmi.multiplications

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun mulevent(view: View) {
        var getNum1=findViewById<EditText>(R.id.num1)
        var getNum2=findViewById<EditText>(R.id.num2)
        var res=getNum1.text.toString().toInt() * getNum2.text.toString().toInt()
        Toast.makeText(this,res.toString(),Toast.LENGTH_SHORT).show()
    }
}