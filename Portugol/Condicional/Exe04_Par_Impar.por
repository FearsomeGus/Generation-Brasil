/*
 4) Faça um sistema que leia um número inteiro e mostre uma mensagem indicando se este
número é par ou ímpar, e se é positivo ou negativo.
 */programa
{
	
	funcao inicio()
	{

	inteiro num
		escreva("Informe um inteiro: ")
		leia(num)

		
		
		se (0 == num % 2 e num > 0){
			escreva("Este numero é positivo e par")
		}senao se (0 == num % 2 e num < 0){
			escreva("Este numero é negativo e par")
		}senao se (0 != num % 2 e num > 0){
			escreva("Este numero é positivo e impar")
		}senao se (0 != num % 2 e num < 0)
			escreva("Este numero é negativo e impar")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 141; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */