/*3- Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
categoria ela se encontra:
 10-14 infantil
 15-17 juvenil
 18-25 adulto*/

fun main(args: Array<String>) {
    print("Informe sua idade: ")
    val idade = readln().toInt()

    if (idade in 10..14){
        print("Infantil")
    }else if(idade in 15..17){
        print("Juvenil")
    }else if(idade in 18..25){
        print("Adulto")
    }

}