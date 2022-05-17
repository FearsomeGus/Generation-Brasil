/*
3) Desenvolva um sistema em que:
Leia 4 (quatro) números;
Calcule o quadrado de cada um;
Se o valor resultante do quadrado do terceiro for &gt;= 1000, imprima-o e finalize;
Caso contrário, imprima os valores lidos e seus respectivos quadrados.
 */
 
programa
{
	
	funcao inicio()
	{

	inteiro A, B, C, D, V, X, Y,Z

		escreva("Informe o primeiro valor: ")
		leia(A)
		escreva("Informe o segundo valor: ")
		leia(B)
		escreva("Informe o terceiro valor: ")
		leia(C)
		escreva("Informe o quarto valor: ")
		leia(D)
		
		V = A * A
		X = B * B
		Y = C * C
		Z = D * D

		se (Y > 1000)
		{
			escreva(" ", Y)
		} senao {
			escreva(" ", V)
			escreva(" ", X)
			escreva(" ", Y)
			escreva(" ", Z)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 264; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */