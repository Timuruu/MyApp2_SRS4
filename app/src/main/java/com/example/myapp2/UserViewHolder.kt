package com.example.myapp2

import android.annotation.SuppressLint
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class UserViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {

    @SuppressLint("WrongConstant")
    fun bind(user:User){
        val nameTextView:TextView = itemView.findViewById(R.id.name_text_view)
        val ageTextView:TextView = itemView.findViewById(R.id.age_text_view)

        nameTextView.text = "Город - ${user.name}     "
        ageTextView.text = "Возраст - ${user.age} "
        itemView.setOnClickListener {
            //Toast.makeText(itemView.context, user.name, Toast.LENGTH_LONG).show()
            Toast.makeText(itemView.context,"I see, you click",Toast.LENGTH_LONG).show()
        }
    }

}