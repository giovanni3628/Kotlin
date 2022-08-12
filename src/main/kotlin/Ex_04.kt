//4) Faça um sistema que leia um número inteiro
// e mostre uma mensagem indicando se este número é par ou ímpar,
// e se é positivo ou negativo.
fun main() {

    println("Digite um número:")
    val numero = readLine()!!.toInt()

    if( numero % 2 == 0){
        println("O número é par")
    } else{
        println("O número é ímpar")
    }


}
