/*4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.
 */
import kotlin.math.pow
import kotlin.math.sqrt


fun main() {

    println("Digite um número:")
    val numero = readln().toFloat()

    if(numero % 2.0 == 0.0){

        val raiz = sqrt(numero)
        println("A raiz é: $raiz")


    }else{
        val potencia = numero.pow(2)
        println("A potência é: $potencia")
    }

}