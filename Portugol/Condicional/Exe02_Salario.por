/*
 2) Elabore um sistema que leia as variáveis C e N, respectivamente código e número de
horas trabalhadas de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00
por hora. Quando o número de horas exceder a 50 calcule o excesso de pagamento
armazenando-o na variável E, caso contrário zerar tal variável. A hora excedente de
trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário
excedente.
 */
programa
{
	
	funcao inicio()
	{
		inteiro N, S, E, H
		inteiro L = 50
		
		escreva("Informe o total de horas trabalhadas :")
		leia(N)

		se (N < 50)
		{
			S = N * 10
			escreva("Seu salário é de ", S)
			escreva("\n")
			escreva("Suas horas extras: 0")
		} senao {
			S = 50 * 10
			E = N - L 
			H = E * 20
			
			escreva("Seu salário é de ", S)
			escreva("\n")
			escreva("Suas horas extras:", H)
		}
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 438; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */