package com.example.iteradmin.kotlin_listview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val list=findViewById<ListView>(R.id.list)
        val data1= arrayOf("laptop","mobile","mouse","hard disk","monitor","ac","fan","onion")
        val adp= ArrayAdapter<String>(this,R.layout.data,data1)
        list.adapter=adp
        list.setOnItemClickListener(){
            parent, view, position, id ->
            Toast.makeText(this, "positon of ${position}",Toast.LENGTH_LONG).show()
        }
    }
}
