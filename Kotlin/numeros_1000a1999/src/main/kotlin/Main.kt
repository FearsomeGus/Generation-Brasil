/*Informar todos os números de 1000 a 1999 que quando divididos por 11
obtemos resto = 5. (FOR)*/

fun main(args: Array<String>) {

    for (i in 1000..1999){
        if (5 == i % 11){
            println("$i")
        }
    }

}