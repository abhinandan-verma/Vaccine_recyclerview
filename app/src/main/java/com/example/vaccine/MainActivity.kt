package com.example.vaccine

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1- AdapterView: RecyclerView
        val recyclerView: RecyclerView = findViewById(R.id.recyclerview)
        recyclerView.layoutManager =
            LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)

        // 2- Dta source: List of VaccineModel
        val vaccineList: ArrayList<VaccineModel> = ArrayList()
        val v1 = VaccineModel("Covaxin",R.drawable.cavaxin)
        val v2 = VaccineModel("Covishield",R.drawable.covishield)
        val v3 = VaccineModel("Phzer",R.drawable.covid)
        val v4 = VaccineModel("Measles",R.drawable.measles)
        val v5 = VaccineModel("Hepatitis",R.drawable.hepatitis)
        val v6 = VaccineModel("Rotavirus",R.drawable.rotavirus)
        val v7 = VaccineModel("Tetanus",R.drawable.tetanus)
        val v8 = VaccineModel("Polio",R.drawable.polio)

        vaccineList.add(v1)
        vaccineList.add(v2)
        vaccineList.add(v3)
        vaccineList.add(v4)
        vaccineList.add(v5)
        vaccineList.add(v6)
        vaccineList.add(v7)
        vaccineList.add(v8)

        // 3- Adapter
        val adapter = MyAdapter(vaccineList)
        recyclerView.adapter = adapter

    }
}