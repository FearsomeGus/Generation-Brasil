import kotlin.math.sqrt

class Calculadora {
    fun calculadora() {
        print("Informe o primeiro inteiro: ")
        var N1 = readln().toInt()
        print("Informe a operação: ")
        var Op = readln().toString()
        if (Op == "X") {
            val N3 = sqrt(N1.toDouble())
            print("A raiz quadrada de $N1 = $N3")
        } else {
            print("Informe o segundo inteiro: ")
            var N2 = readln().toInt()
            when (Op) {

                "+" -> {
                    val N3 = N1 + N2
                    print("A soma entre $N1 e $N2 = $N3",)
                }
                "-" -> {
                    val N3 = N1 - N2
                    print("A subtração entre $N1 e $N2 = $N3",)
                }
                "*" -> {
                    val N3 = N1.toDouble() * N2.toDouble()
                    print("A multiplicação entre $N1 e $N2 = $N3",)
                }
                "/" -> {
                    val N3 = N1 / N2
                    print("A divisão entre $N1 e $N2 = $N3",)
                }
                "^" -> {
                    val N3 = Math.pow(N1.toDouble(), N2.toDouble())
                    print("A potenciação de $N1 elevado a $N2 = $N3")
                }


            }
        }
    }
}