package com.example.recyclerview_v_1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val dress: List<Dress>): RecyclerView.Adapter<MyAdapter.UserViewHolder>() {

     class UserViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

         val name: TextView = itemView.findViewById(R.id.name_item)
         val description: TextView = itemView.findViewById(R.id.description_item)
         val image: ImageView = itemView.findViewById(R.id.image_item)



     }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {

             val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
         return UserViewHolder(itemView)
    }

    override fun getItemCount() = dress.size



    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {

         holder.description.text = dress[position].description
         holder.name.text = dress[position].name
         holder.image.setImageResource(dress[position].image)
    }

}


      // implementation(libs.androidx.recyclerview)