package com.example.example.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.example.data.models.Comment
import com.example.example.databinding.ItemCommentBinding

class CommentAdapter(var items: List<Comment>): RecyclerView.Adapter<CommentAdapter.ViewHolder>() {


    class ViewHolder(val view: ItemCommentBinding): RecyclerView.ViewHolder(view.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemCommentBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val comment = items[position]
        holder.view.itemCommentName.text = comment.author
        holder.view.itemCommentMessage.text = comment.description
        holder.view.itemCommentDate.text = comment.data
        Glide.with(holder.itemView).load(comment.image).into(holder.view.itemCommentPhoto)

    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun newDataSet(newComments: List<Comment>){
        items= newComments
        notifyDataSetChanged()
    }


}