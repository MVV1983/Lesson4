package com.example.lesson4

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BannerHolder(parent: ViewGroup, context: Context) : RecyclerView.ViewHolder(
    LayoutInflater.from(context).inflate(R.layout.banner_item, parent, false)
) {


    var newIncident: TextView? = null
    var discription: TextView? = null
    var imageBanner: ImageView
    var accept: TextView? = null

    init {
        newIncident = itemView.findViewById(R.id.newIncident)
        discription = itemView.findViewById(R.id.descriptionIncident)
        imageBanner = itemView.findViewById(R.id.imageView2)
        imageBanner.setImageResource(R.drawable.ic_banner)
        accept = itemView.findViewById(R.id.takeBtn)

    }

    fun bind(item: ListItem) {

        val index = item as ListItem.BannerItem

        newIncident?.text = index.title
        discription?.text = index.description

    }
}