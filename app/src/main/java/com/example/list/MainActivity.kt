package com.example.list

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    val modeloCoches = arrayOf(
        "Vento",
        "Jetta",
        "Fit",
        "Sonic",
        "206",
        "Tsuru",
        "Versa",
        "Windstar",
        "Safira",
        "Monsa",
        "Lobo",
        "HR-V",
        "Gol",
        "Bora",
        "Rav4",
        "Astra",
        "Mustang",
        "Corsa",
        "Pointer",
        "Aveo",
        "Beetle",
        "Mini cooper"
    )

    private lateinit var listView : ListView
    private lateinit var lToast : Toast

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lToast = Toast.makeText(applicationContext, null, Toast.LENGTH_SHORT);

        val itemsAdapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, modeloCoches)
        listView = findViewById(R.id.listView)
        listView.adapter = itemsAdapter

        listView.onItemClickListener = AdapterView.OnItemClickListener{ parent, view, position, id ->
            lToast.setText("seleccionaste el coche ${modeloCoches[position]}")
            lToast.show()
        }
    }
}