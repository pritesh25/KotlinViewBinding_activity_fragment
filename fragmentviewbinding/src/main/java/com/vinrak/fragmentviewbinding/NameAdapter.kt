package com.vinrak.fragmentviewbinding

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.vinrak.fragmentviewbinding.databinding.ItemLayoutBinding

class NameAdapter(
    var cxt: Context,
    private var categoryList: ArrayList<String>
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return LanguageViewHolder(
            ItemLayoutBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    class LanguageViewHolder(itemView: ItemLayoutBinding) : RecyclerView.ViewHolder(itemView.root) {
        val b: ItemLayoutBinding = itemView
    }

    override fun getItemCount(): Int {
        return categoryList.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        if (holder is LanguageViewHolder) {

            holder.b.tvName.text = categoryList[position]

        }
    }

}