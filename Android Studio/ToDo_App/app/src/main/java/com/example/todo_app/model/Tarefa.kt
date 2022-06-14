package com.example.todo_app.model

data class Tarefa (
    var id: Long,
    var nome: String,
    var descrcao: String,
    var responsavel: String,
    var data: String,
    var status: Boolean,
    var categoria: Categoria
        ) {
}