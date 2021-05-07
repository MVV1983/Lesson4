package com.example.lesson4

import android.R.attr.button
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.marginEnd
import androidx.core.view.marginRight
import androidx.recyclerview.widget.RecyclerView


class StudentHolder(parent: ViewGroup, context: Context) : RecyclerView.ViewHolder(
    LayoutInflater.from(context).inflate(R.layout.student_item, parent, false)
) {


    var studentFIO: TextView? = null
    var studentDescription: TextView? = null
    var image: ImageView
    var imageArrow: ImageView

    init {
        studentFIO = itemView.findViewById(R.id.student_fi)
        studentDescription = itemView.findViewById(R.id.student_description)

        image = itemView.findViewById(R.id.imageView)
        imageArrow = itemView.findViewById(R.id.arrowImage)
        image.setImageResource(R.drawable.ic_si_history)
        imageArrow.setImageResource(R.drawable.ic_arrow)
    }

    fun bind(item: ListItem) {
        val index = item as ListItem.StudentItem
        var fio = index.secondName + " " + index.name

        studentFIO?.text = fio
        studentDescription?.text = index.description

        if (index.hasPortfolio) {
            //visible element
            imageArrow.setVisibility(View.VISIBLE)

        } else {
            imageArrow.setVisibility(View.GONE)
        }
    }

}