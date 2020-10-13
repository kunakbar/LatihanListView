package com.example.mylistview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class VegetableAdapter internal constructor(private val context: Context) : BaseAdapter() {
    internal var vegetables = arrayListOf<Vegetable>()

    override fun getView(position: Int, view: View?, viewGroup: ViewGroup): View {
        var itemView = view
        if (itemView == null) {
            itemView = LayoutInflater.from(context).inflate(R.layout.item_vegetable, viewGroup, false)
        }

        val viewHolder = ViewHolder(itemView as View)

        val vegetable = getItem(position) as Vegetable
        viewHolder.bind(vegetable)
        return itemView
    }

    override fun getItem(i: Int): Any = vegetables[i]

    override fun getItemId(i: Int): Long = i.toLong()

    override fun getCount(): Int = vegetables.size
}

private class ViewHolder internal constructor(view: View) {
    private val txtName: TextView = view.findViewById(R.id.txt_name)
    private val txtDescription: TextView = view.findViewById(R.id.txt_description)
    private val imgPhoto: CircleImageView = view.findViewById(R.id.img_photo)

    internal fun bind(vegetable: Vegetable) {
        txtName.text = vegetable.name
        txtDescription.text = vegetable.description
        imgPhoto.setImageResource(vegetable.photo)
    }
}