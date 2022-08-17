/*3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)*/

fun main() {

    var cont21: Int = 0
    var cont50: Int = 0

    while (true){

        println("Digite sua idade: ")

        val idade = readln().toInt()

        if (idade in 1 .. 21 ){
            cont21++
        }else if (idade >= 50){
            cont50++
        }
        if (idade == -99){
            break
        }

    }
    println("Tem $cont21 menores ou iguais a 21 anos")
    println("Tem $cont50 maiores ou iguais 50 anos")
}