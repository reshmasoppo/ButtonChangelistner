package com.example.buttonchangelistner

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var editname:EditText
    lateinit var button2:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editname=findViewById<EditText>(R.id.editText1)
        editname=findViewById<EditText>(R.id.editText2)
        button2=findViewById<Button>(R.id.button2)


        button2.setOnClickListener {
            var name1string:String=editText1.text.toString()
            var name2sstring:String=editText2.text.toString()

            var intent:Intent= Intent(this,Second::class.java)
            intent.putExtra("name1",name1string)
            intent.putExtra("name2",name2sstring)
            startActivity(intent)




        }

    }
}
