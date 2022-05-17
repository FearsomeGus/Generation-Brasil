//1- Faça um programa que receba três inteiros e diga qual deles é o maior.
fun main(args: Array<String>) {
    print("Inferme o primeiro inteiro: ")
    val N1 = readln()

    print("Inferme o segundo inteiro: ")
    val N2 = readln()

    print("Inferme o inteiro inteiro: ")
    val N3 = readln()
    if(N1 > N2 && N1 > N3) {
        print("O maior número é $N1")
    }else if(N2 > N1 && N2 > N3) {
        print("O maior número é $N2")
    }else{
        print("O maior númeor é $N3")
    }
}