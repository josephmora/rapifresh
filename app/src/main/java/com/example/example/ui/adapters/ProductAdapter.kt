package com.example.example.ui.adapters

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.example.ui.listeners.OnProductListener
import com.example.example.data.models.Product
import com.example.example.databinding.ItemProductBinding


class ProductAdapter(var items: List<Product>): RecyclerView.Adapter<ProductAdapter.ViewHolder>() {

    var listener: OnProductListener? = null

    class ViewHolder(val item: ItemProductBinding): RecyclerView.ViewHolder(item.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemProductBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        holder.item.itemProductName.text = item.name
        holder.item.itemProductPrice.text = item.price

        //permite cargar imagenes por url
        Glide.with(holder.itemView).load(item.image).into(holder.item.itemProductPhoto)


        //detectar clic y realizar algo
        holder.item.root.setOnClickListener(){
            listener?.onClick(item)
        }

    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun newDataSet(newProducts: List<Product>){
        items = newProducts
        notifyDataSetChanged()
    }



}