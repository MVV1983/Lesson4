package com.example.lesson4

import android.content.Context
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CustomRecyclerAdapter(val context: Context) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private companion object {
        const val STUDENT = 1001
        const val BANNER = 1002
    }

    val list = mutableListOf<ListItem>()

    //update all elements list
    fun update(data: List<ListItem>) {
        list.clear()
        list.addAll(data)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            STUDENT -> StudentHolder(parent,context)
            BANNER -> BannerHolder(parent,context)
            else -> throw IllegalArgumentException("Invalid type of data ")
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        return when (holder) {
            is StudentHolder -> holder.bind(list[position])
            is BannerHolder -> holder.bind(list[position])
            else -> throw IllegalArgumentException("Invalid type of data ")
        }

    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun getItemViewType(position: Int): Int {
        val comparable = list[position]
        return when (comparable) {
            is ListItem.StudentItem -> STUDENT
            is ListItem.BannerItem -> BANNER
        }
    }
}