package com.example.tablayoutwithviewpager2kotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_view_pager.view.*

// (2) inherrite RecyclerView.Adapter
class ViewPagerAdapter(val images : List<Int>) : RecyclerView.Adapter<ViewPagerAdapter.ViewPagerViewHolder>() {

    // (1) create an inner class
    inner class ViewPagerViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerViewHolder {
        // (4) Inflate the view
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_view_pager, parent, false)
        return ViewPagerViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewPagerViewHolder, position: Int) {
        // (5) find the current image position
        val currentImage = images[position]
        // set the current image to the current view
        holder.itemView.iv_image.setImageResource(currentImage)
    }

    override fun getItemCount(): Int {
        // (3)
        return images.size
    }
}