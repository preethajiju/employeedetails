package com.example.employeeapp

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

    fun buttonclickevent(view: View) {
       var getCode=findViewById<EditText>(R.id.code)
        var getName=findViewById<EditText>(R.id.name)
        var getDesig=findViewById<EditText>(R.id.desig)
        var getPlace=findViewById<EditText>(R.id.place)
        Toast.makeText(this,getCode.text.toString(),Toast.LENGTH_LONG).show()
        Toast.makeText(this,getName.text.toString(),Toast.LENGTH_LONG).show()
        Toast.makeText(this,getDesig.text.toString(),Toast.LENGTH_LONG).show()
        Toast.makeText(this,getPlace.text.toString(),Toast.LENGTH_LONG).show()


    }
}