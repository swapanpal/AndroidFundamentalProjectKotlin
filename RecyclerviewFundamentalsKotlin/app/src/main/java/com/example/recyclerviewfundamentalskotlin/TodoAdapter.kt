package com.example.recyclerviewfundamentalskotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_todo.view.*

class TodoAdapter(var todos : List<Todo>) : RecyclerView.Adapter<TodoAdapter.TodoViewHolder>() {

    // First create the inner class then add constructor for TodoAdapter
     inner class TodoViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {

        // (2) todos
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_todo, parent, false)
        return TodoViewHolder(view)
    }

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
        // (3) todos
        holder.itemView.apply {
            tv_title.text = todos[position].title
            cb_done.isChecked = todos[position].isChecked
        }
    }

    override fun getItemCount(): Int {
        // (1) todos
        return todos.size
    }
}