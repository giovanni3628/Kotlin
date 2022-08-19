/*Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
trabalhar com Collection do tipo List do Kotlin para manipular os dados desse estoque, o
programa deverá atender as seguintes funcionalidades:

Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.
 */

fun main() {

    while (true){

        println("=========================")
        println("| 1 - Adicionar Produto |")
        println("| 2 - Remover Produto   |")
        println("| 3 - Atualizar Produto |")
        println("| 4 - Exibir Produtos   |")
        println("| 5 - Sair              |")
        println("=========================")

        println("Opção: ")
        when(readln().toInt()){
            1 -> addProdutos()
            2 -> removeProdutos()
            3 -> updateProdutos()
            4 -> getProdutos()
            5 -> break
        }
    }
}