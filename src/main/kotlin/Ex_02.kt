/*2- Faça um programa que entre com três números e coloque em ordem crescente. */

fun main() {

    println("Digite o primeiro número:")
    val n1 = readln().toInt()

    println("Digite o segundo número:")
    val n2 = readln().toInt()

    println("Digite o terceiro número:")
    val n3 = readln().toInt()

    if (n1 > n2 && n1 > n3 && n2 > n3){
        println("A ordem crescente dos número é $n1, $n2, $n3")
    }else if (n2 > n1 && n2 > n3 && n1 > n3){
        println("A ordem crescente dos número é $n2, $n1, $n3")
    }else if (n3 > n1 && n3 > n2 && n2 > n1 ){
        println("A ordem crescente dos número é $n3, $n2, $n1")
    }else if (n3 > n1 && n3 > n2 && n1 > n2){
        println("A ordem crescente dos número é $n3, $n1, $n2")
    }else if (n2 > n1 && n2 > n3 && n3 > n1){
        println("A ordem crescente dos número é $n2, $n3, $n1")
    }
}