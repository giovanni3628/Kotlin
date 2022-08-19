val produtos = mutableListOf<String>()

fun addProdutos(){
    while (true){
        println("Digite um produto para adicionar a lista: ")
        val nome = readln()

        if (nome != ""){
            produtos.add(nome)
            println("Produto $nome adicionado com sucesso!")
            break
        }else{
            println("Produto $nome inválido")
        }
    }

}

fun removeProdutos(){
    while (true){
        println("Digite um produto para remover da lista: ")
        val nome = readln()

        if (produtos.contains(nome)){
            produtos.remove(nome)
            println("Produto $nome removido com sucesso!")
            break
        }else{
            println("Produto $nome não existe na lista!")
        }
    }
}

fun updateProdutos(){
    while (true){
        println("Digite o produto que quer atualizar: ")
        val nome = readln()

        if (produtos.contains(nome)){
            val posicao = produtos.indexOf(nome)

            println("Digite um novo produto: ")
            produtos[posicao]= readln()
            println("produto atualizado com sucesso!")
            break
        }else{
            println("Digite um produto já existente: ")
        }
    }
}

fun getProdutos(){
    println()
    println(produtos)
}