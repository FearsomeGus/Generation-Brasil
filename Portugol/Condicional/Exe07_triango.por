/*
 7) Receber valores de base e altura de um triângulo e verificar se são valores válidos
(positivos maiores que zero). Em caso afirmativo, calcular a área do triângulo. 
 */

programa
{
	
	funcao inicio()
	{
		real area, altura, base
		
		escreva("Informe a altura: ")
		leia(altura)
		escreva("Informe a base: ")
		leia(base)

		se (altura > 0 e base > 0)
		{
			area = (base * altura) / 2
			escreva("A area do triangulo é: ", area)
		} senao {
			escreva("Somente possivel fazer o calculo com numeros positivos.")
		}

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 170; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */