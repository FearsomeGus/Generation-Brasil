fun main(args: Array<String>) {

    print("Informe o primeiro numero: ")
    val num1 = readln().toDouble()
    print("Informe o segunto numero: ")
    val num2 = readln().toDouble()
    print("Informe a operação: ")
    val oper = readln().toString()

    when (oper) {
        "+" -> print("A soma entre $num1 e $num2 é: ${soma(num1, num2)}")
        "-" -> print("A subtração entre $num1 e $num2 é: ${sub(num1, num2)}")
        "*" -> print("A multiplicação entre $num1 e $num2 é: ${mult(num1, num2)}")
        "/" -> print("A divisão entre $num1 e $num2 é: ${div(num1, num2)}")
    }
}

fun soma (num1: Double,num2: Double): Double {
    return num1 + num2
}
fun sub (num1: Double,num2: Double): Double{
    return num1 - num2
}
fun mult (num1: Double,num2: Double): Double {
    return num1 * num2
}
fun div (num1: Double, num2: Double): Double {
    return num1 / num2
}