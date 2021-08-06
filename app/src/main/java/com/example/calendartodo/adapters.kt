package com.example.calendartodo

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.itempage2.view.*
import kotlinx.android.synthetic.main.note_widget_l.view.*

class ViewPagerAdapter : RecyclerView.Adapter<PagerVH>( ) {

    private val names=arrayOf(
        "Vietnam",
        "Vietkong",
        "Chinchng",
        "Hookes"
    )
    private val colors = intArrayOf(
        android.R.color.black,
        android.R.color.holo_red_light,
        android.R.color.holo_blue_dark,
        android.R.color.holo_purple
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PagerVH =
        PagerVH(LayoutInflater.from(parent.context).inflate(R.layout.itempage2, parent, false))

    override fun getItemCount(): Int = colors.size


    override fun onBindViewHolder(holder: PagerVH, position: Int) = holder.itemView.run {
        GMV.text = ("Good Morning, " + names[position])
        containerpage.setBackgroundResource(colors[position])
    }
}

class PagerVH(itemView: View) : RecyclerView.ViewHolder(itemView)

