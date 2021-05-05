package com.example.lesson4

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class StudentHolder(parent: ViewGroup, context: Context) : RecyclerView.ViewHolder(LayoutInflater.from(context).inflate(R.layout.student_item,parent,false)){

    var studentFIO: TextView? = null
    var studentDescription: TextView? = null
    var image: ImageView

    init {
        studentFIO = itemView.findViewById(R.id.student_fi)
        studentDescription = itemView.findViewById(R.id.student_description)
        image = itemView.findViewById(R.id.imageView)
        image.setImageResource(R.drawable.ic_si_history)
    }

    fun bind(item: ListItem){
        val index = item as ListItem.StudentItem
        var fio = index.name+" "+index.secondName

        studentFIO?.text = fio
        studentDescription?.text = index.description
        if(index.hasPortfolio){
            //visible element

        }
    }

}