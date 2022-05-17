// 1 - Faça um programa em que o usuário digite o diâmetro de um círculo e calcule a área e o perímetro dele

/*
   print("Digite seu nome: ")
   var nome = readln()

   print("Digite sua idade: ")
   //Conversão de Tipos - toTipo()
   var idade = readln().toInt()

   print("Digite a sua altura: ")
   var altura = readln().toDouble()

   println("Olá, meu nome é $nome, tenho $idade anos de idade e tenho ainda" +
           " $altura de altura.")
    */

fun main(args: Array<String>) {
print("Informe o valor do diametro: ")
    var diametro = readln().toDouble()

    var perimetro = 3.14 * diametro

    var area = 3.14 * (diametro*diametro / 4)

    println("A area é de: $area")
    println("O perimetro de: $perimetro")

}