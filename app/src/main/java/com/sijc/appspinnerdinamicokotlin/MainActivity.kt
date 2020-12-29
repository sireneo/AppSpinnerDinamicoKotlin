package com.sijc.appspinnerdinamicokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewParent
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lenguajes = resources.getStringArray(R.array.Lenguajes)
        val spinner = findViewById<Spinner>(R.id.spinner)
        if (spinner != null){
            val adaptador = ArrayAdapter(this,android.R.layout.simple_spinner_item, lenguajes)
            spinner.adapter = adaptador

            spinner.onItemSelectedListener = object :AdapterView.OnItemSelectedListener{
               override fun onItemSelected(
                    parent: AdapterView<*>,
                    view: View,
                    position: Int,
                    id: Long
                ) {
                    Toast.makeText(this@MainActivity,
                        getString(R.string.seleccione_item) + " " +
                                "" + lenguajes[position], Toast.LENGTH_SHORT).show()
                }

                override fun onNothingSelected(parent: AdapterView<*>?) {
                   // TODO("Not yet implemented")
                }
            }

        }
    }
}