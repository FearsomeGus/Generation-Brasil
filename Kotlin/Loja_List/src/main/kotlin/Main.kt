/*Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
trabalhar com Collection do tipo List do Kotlin para manipular os dados desse estoque, o
programa deverá atender as seguintes funcionalidades:

Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.*/


fun main(args: Array<String>) {
    println("Para adicionar produtos: A \n" +
            "Para excluir produtos: E \n" +
            "Para atualizar produtos: T \n" +
            "Para saber o total: B")

    val menu = readln()
    when(menu) {
        "A" -> {
        val produtos = mutableListOf<String>()

        while (true) {
            print("Informe os produtos a serem adiconados: ")
            val prod = readln()

            if (prod != "") {
                produtos.add(prod)
            } else {
                break
            }
        }
    }
        "E" -> {
            val produtos = mutableListOf<String>()
            println("O total de produtos é de: ${produtos.size}")
            println(produtos)

            while (true) {
                print("Informe o produto que quer excluir: ")
                val prod = readln()

                if (produtos.contains(prod)) {
                    produtos.remove(prod)
                    break
                } else {
                    println("O produto $prod não existe na lista")
                }

            }
        }

        "T" -> {
            val produtos = mutableListOf<String>()
        println("Digite o produto que quer atualizar: ")
        val editaProduto = readln()

        if (produtos.contains(editaProduto)) {
            val index = produtos.indexOf(editaProduto)
            println("Digite o novo produto: ")
            val prod = readln()
            produtos[index] = prod
            println("O produto foi atualizado com sucesso.")
        } else {
            println("O nome $editaProduto não existe na lista")
        }

    }
        "B" -> {
            val produtos = mutableListOf<String>()
            println("O total de produtos é de: ${produtos.size}")
            println(produtos)
        }

}

}

