package com.example.recyclerview_v_1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val dress: List<Dress>): RecyclerView.Adapter<MyAdapter.UserViewHolder>() {

    private var onDressClickListener: OnDressClickListener? = null

    interface OnDressClickListener{
        fun onDressClick( dress: Dress, position: Int ) }


     class UserViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

         val name: TextView = itemView.findViewById(R.id.name_item)
         val image: ImageView = itemView.findViewById(R.id.image_item)



     }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {

             val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
         return UserViewHolder(itemView)
    }

    override fun getItemCount() = dress.size



    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {

         holder.name.text = dress[position].name
         holder.image.setImageResource(dress[position].image)
         holder.itemView.setOnClickListener {
              if ( onDressClickListener != null ) onDressClickListener!!.onDressClick(dress[position],position)
         }
     }

             fun setOnDressClickListener(onDressClickListener: OnDressClickListener){
                 this.onDressClickListener = onDressClickListener
             }

}


      // implementation(libs.androidx.recyclerview)