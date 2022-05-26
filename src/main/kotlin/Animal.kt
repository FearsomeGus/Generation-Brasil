open class Animal (var nome: String, var idade: Int) {

    open fun emitirSom(){
        println("som")
    }
    open fun movimentar(){
        println("movimentar")
    }
}
