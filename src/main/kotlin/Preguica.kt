class Preguica(nome: String, idade: Int) : Animal(nome, idade) {

    override fun emitirSom(){
        super.emitirSom()
        println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAA")

    }

    override fun movimentar() {
        super.movimentar()
        println("Sobe na árvore")

    }
}