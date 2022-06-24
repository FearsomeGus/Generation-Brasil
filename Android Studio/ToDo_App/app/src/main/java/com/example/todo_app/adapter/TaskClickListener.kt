package com.example.todo_app.adapter

import com.example.todo_app.model.Tarefa

interface TaskClickListener {

    fun onTasklickListener (tarefa: Tarefa)
    }
}