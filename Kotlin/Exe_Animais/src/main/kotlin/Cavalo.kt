class Cavalo(nome: String, idade: Int) : Animal(nome, idade) {

    override fun emitirSom(){
        super.emitirSom()
        println("Relincha")
    }

    override fun movimentar() {
        super.movimentar()
        println("Galopa")
    }
}