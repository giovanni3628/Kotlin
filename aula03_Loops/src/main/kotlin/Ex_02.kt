/*2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)*/

fun main() {


    var contadorPar = 0
    var contadorImpar = 0

    for (i in 1 .. 10){
        println("Digite um número: ")
        val num = readln().toInt()

        if (num % 2 == 0){
            contadorPar++
        }else{
            contadorImpar++
        }
    }



    println("Dos números que você digitou $contadorPar são pares.")
    println("Dos números que você digitou $contadorImpar são ímpares.")

}