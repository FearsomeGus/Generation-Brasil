package model

data class Tarefa (
    val nome: String,
    var descricao: String,
    var responsavel: String,
    var data: String,
    var status: Boolean,
    var cateria: String,
        ) {
}