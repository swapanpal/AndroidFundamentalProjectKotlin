package com.example.recyclerviewfundamentalskotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // list for recyclerview item
        var todoList = mutableListOf(
            Todo("Follow Android app", false),
             Todo("Follow Android Studio", false),
             Todo("Follow Kotlin", false),
             Todo("Follow Philip tutorial", true),
             Todo("Practice Kotlin", false),
             Todo("work hard for Kotlin", false),
             Todo("Follow Yourself", false)
        )
        val adapter = TodoAdapter(todoList)
        rv_todos.adapter = adapter
        rv_todos.layoutManager = LinearLayoutManager(this)

        // Add listener to the button to add new todo list
        btn_addTodo.setOnClickListener {
            val title = et_todo.text.toString()
            val todo = Todo(title,false)
            todoList.add(todo)

            // to update recycler for this changes
           // adapter.notifyDataSetChanged()  // this will update all dataset of the recyclerview
            adapter.notifyItemInserted(todoList.size - 1)  // item insert at the last of the list

        }
    }
}