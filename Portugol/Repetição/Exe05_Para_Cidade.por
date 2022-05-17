/*
	 1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:   
a) média do salário da população; 
b) média do número de filhos; 
c) maior salário; 
d) percentual de pessoas com salário até R$100,00.  
	*/

programa
{
	
	funcao inicio()
	{
		inteiro salario = 0, filhos = 0, media = 0, totalmedia1 = 0, totalsal = 0, totalfilhos = 0, maiorSalario = 0, 
		salarioMenor = 0, cont = 0, porcentPessoas = 0, totalPessoas = 20
		//Iniciamos com a estrutura PARA que foi definida para repetir 20 vezes
		para (inteiro i = 0; i < 20; i++){
			escreva("Informe o seu salário: ")
			leia(salario)
			escreva("Informe o total de filhos: ")
			leia(filhos)
			escreva("-----------------------------\n")
		//A variavel totalsal recebe o valor dela mesma mais o valor que foi atribuido pela variavel salario	
			totalsal = totalsal + salario
		//logo depois faz o calculo da média de salarios	
			media = totalsal/4
		//A variavel totalfilhos recebe o valor dela mesma mais o valor que foi atribuido pela variavel filhos
			totalfilhos = totalfilhos + filhos
		//logo depois faz o calculo da média de salarios
			totalmedia1 = totalfilhos/4
		//Aqui encontramos o salário mais alto. A variavel inicia com zero, portanto qualquer valor colocado fica maior.
		//Então se o salario foi maior que o colocado anteriormente irá substituir em maiorSalario
			se ( salario > maiorSalario){
				maiorSalario = salario
		//Aqui definimos a porcentagem de pessoas como salário menor que 100. 
		//Precisei criar a variavel totalPessoas que deve seguir o valor do i pois só assim encontrei uma forma de calcular
		//a porcentagem. Então nesse caso o totalPessoas vale 20 de acordo com a repetição do i.
			}
			se ( salario < 100){
				cont++
				porcentPessoas = (cont * 100 ) / totalPessoas
			}
		} 
			
		escreva("O maior salário é de: ", maiorSalario)
		escreva(" \n")
		escreva("A média salarial é de: ", media)
		escreva(" \n")
		escreva("A média de filhos é de: ", totalmedia1)
		escreva(" \n")
		escreva("A porcentagem de salários menor que R$100,00 é ", porcentPessoas ," %")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 685; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {maiorSalario, 14, 94, 12}-{salarioMenor, 15, 2, 12}-{cont, 15, 20, 4}-{porcentPessoas, 15, 30, 14}-{totalPessoas, 15, 50, 12}-{i, 17, 16, 1};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */