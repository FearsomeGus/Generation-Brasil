class Cachorro(nome: String, idade: Int) : Animal(nome, idade) {

    override fun emitirSom(){
        super.emitirSom()
        println("Au Au Au")
    }

    override fun movimentar(){
        super.movimentar()
        println("Corre")
    }
}