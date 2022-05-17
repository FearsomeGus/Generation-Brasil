/// - Faça um programa que entre com três números e coloque em ordem crescente.

fun main(args: Array<String>) {
    print("Escreva o primeiro número: ")
    val N1 = readln()

    print("Escreva o segundo número:  ")
    val N2 = readln()

    print("Escreva o terceiro número: ")
    val N3 = readln()

    if (N1 < N2 && N2 < N3) {
        println("$N1 $N2 $N3")
    } else if (N2 < N1 && N1 < N3) {
        println("$N2 $N1 $N3")
    } else if (N2 > N1 && N1 < N2) {
        println("$N3 $N1 $N2")
    } else if (N1 > N2 && N2 < N3) {
        println("$N2 $N3 $N1")
    } else {
        println("$N3 $N2 $N1")
    }
}