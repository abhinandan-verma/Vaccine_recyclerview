package com.example.vaccine

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val vaccineList: ArrayList<VaccineModel>): RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    inner class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var vaccineImage: ImageView
       var vaccineTitle: TextView

        init {
            vaccineImage = itemView.findViewById(R.id.imageview)
            vaccineTitle = itemView.findViewById(R.id.title)

            itemView.setOnClickListener {

                Toast.makeText(itemView.context,"You clicked: ${vaccineTitle.text}",Toast.LENGTH_SHORT).show()
            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val v = LayoutInflater.from(parent.context)
            .inflate(R.layout.recycler_item_lyout,parent,false)
        return MyViewHolder(v)
    }

    override fun getItemCount(): Int {
       return vaccineList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.vaccineTitle.text = vaccineList[position].name
        holder.vaccineImage.setImageResource(vaccineList[position].image)
    }


}