/*1- Faça um programa que receba três inteiros e diga qual deles é o maior. */

fun main() {

    println("Digite o primeiro número:")
    val n1 = readln().toInt()

    println("Digite o segundo número:")
    val n2 = readln().toInt()

    println("Digite o terceiro número:")
    val n3 = readln().toInt()

    if (n1 > n2 && n1 > n3){
        println("O número 1 é o maior número digitado: $n1")
    }else if (n2 > n1 && n2 > n3){
        println("O número 2 é o maior número digitado: $n2")
    }else if (n3 > n1 && n3 > n2){
        println("O número 3 é o maior número digitado: $n3")
    }
}