package com.example.reciclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.reciclerview.adapter.LineAdapter
import com.example.reciclerview.dataClasses.Place

class MainActivity : AppCompatActivity() {
    private lateinit var myList: ArrayList<Place>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myList = ArrayList<Place>()

        var pais: String = "Portugal"
        var cidade: String = "Lisboa"
        var bandeira: String = "amarelo"


        for(i in 0 until 500){ //(i=0; i<500; i++)
            myList.add(Place(" $pais", i+500, "Capital $cidade", "Bandeia $bandeira" ))
        }

        val recview = findViewById<RecyclerView>(R.id.recycler_view)
        recview.adapter = LineAdapter(myList)
        recview.layoutManager = LinearLayoutManager(this)
    }

}