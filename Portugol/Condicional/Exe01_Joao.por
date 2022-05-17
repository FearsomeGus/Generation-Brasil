/*1) João, homem de bem, comprou um microcomputador para controlar o rendimento diário
de seu trabalho. Toda vez que ele traz um peso de tomate maior que o estabelecido pelo
regulamento do estado de São Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo
excedente. João precisa que você faça um sistema que leia a variável P (peso de tomates) e
verifique se há excesso. Se houver, gravar na variável E (Excesso) e na variável M o valor
da multa que João deverá pagar. Caso contrário mostrar tais variáveis com o conteúdo
ZERO.
*/

programa
{
	
	funcao inicio()
	{
		inteiro P //Peso do tomate
		inteiro M //Multa
		inteiro E //Excesso
		inteiro L = 50 //Limite de quilos do tomate
		
		escreva("Informe o peso do tomate: ")
		leia(P)
		
		se (P > L) // Aqui definimos se o peso do tomate é maior que 50
		{			
			E = P - L
			M = E * 4
			escreva("Sua multa a pagar é de R$ ", M) // Se sim, irá fazer o calculo da multa
		} senao { // Caso não seja maior que 50, irá mostrar o peso do tomate e as outras variaveis zeradas
			escreva("Peso:", P)
			escreva(" \n")
			escreva("Excesso: 0 \n")
			escreva("Multa: 0\n")
			
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1134; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */