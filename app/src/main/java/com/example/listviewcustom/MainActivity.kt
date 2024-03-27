package com.example.listviewcustom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lv1 = findViewById<ListView>(R.id.lv1)
        // id is lv1 because I wasn't able to differentiate 1, i, l until I finished the reference video
        // val names = arrayOf("Item A", "Item B", "Item C", "Item D", "Item E")
        var list = ArrayList<Model>()

        list.add(Model("Coffee", "Bitter",R.drawable.coffee))
        list.add(Model("Cupcake","Sweet",R.drawable.cupcake))
        list.add(Model("Mug", "Crunchy",R.drawable.mug))

//        val ourAdapter: ArrayAdapter<String> = ArrayAdapter(
//            this,
//            android.R.layout.simple_list_item_1,
//            names
//        )

        lv1.adapter = MyCustomAdapter(this, R.layout.custom_item_layout, list)

//        lv1.setOnItemClickListener { adapterView, view, i, l ->
//            Toast.makeText(
//                this,
//                "You Selected: " + names[i],
//                Toast.LENGTH_LONG
//            ).show()
//        }
    }
}