programa
{
	
	funcao inicio()
	{
		inteiro salario = 0, filhos = 0, media = 0, totalmedia1 = 0, totalsal = 0, totalfilhos = 0, maiorSalario = 0, 
		salarioMenor = 0, cont = 0, porcentPessoas = 0, totalPessoas
		para (inteiro i = 0; i < 5; i++){
			escreva("Informe o seu salário: ")
			leia(salario)
			escreva("Informe o total de filhos: ")
			leia(filhos)
			escreva("-----------------------------\n")
			totalsal = totalsal + salario
			media = totalsal/4
			totalfilhos = totalfilhos + filhos
			totalmedia1 = totalfilhos/4
			se ( salario > maiorSalario){
				maiorSalario = salario
			}
			se ( salario < 100){

				cont++

				porcentPessoas = (cont / i) / 100
			}
		} 
			
		escreva("O maior salário é de: ", maiorSalario)
		escreva(" \n")
		escreva("A média salarial é de: ", media)
		escreva(" \n")
		escreva("A média de filhos é de: ", totalmedia1)
		escreva(" \n")
		escreva("A porcentagem de salários menor que R$100,00 é: ", porcentPessoas)
		
	}

	/*
	 1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:   
a) média do salário da população; 
b) média do número de filhos; 
c) maior salário; 
d) percentual de pessoas com salário até R$100,00.  
	*/
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 208; 
 * @PONTOS-DE-PARADA = 25;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */