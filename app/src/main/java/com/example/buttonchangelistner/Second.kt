package com.example.buttonchangelistner

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Second: AppCompatActivity() {

    lateinit  var button6:Button
    lateinit  var   textsec1:TextView
    lateinit  var   textsec2:TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_layout)

        button6=findViewById<Button>(R.id.buttonsecond)
        textsec1=findViewById<TextView>(R.id.textViewsec1)
        textsec2=findViewById<TextView>(R.id.textViewsec2)
        /* //get data from intent

         val intent = intent
        val name:String = intent.getStringExtra("name1")
        val email:String = intent.getStringExtra("name2")

        //setText
            textsec1.text=name
            textsec2.text=email */


          val bundle: Bundle? = intent.extras
          val idname1 = bundle!!.get("name1")
          val idname2 = bundle!!.get("name2")
           textsec1.text= idname1.toString()
           textsec2.text= idname2.toString()

       // button6.setOnClickListener{




            //Toast.makeText(applicationContext,"values"  +idname1,Toast.LENGTH_SHORT).show()
           //var intent:Intent = Intent(this, MainActivity::class.java)
           // startActivity(intent)

        //}
        }
}