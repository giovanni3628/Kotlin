//3) Desenvolva um sistema em que:
// Leia 4 (quatro) números;
// Calcule o quadrado de cada um;
// Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
// Caso contrário, imprima os valores lidos e seus respectivos quadrados.
fun main() {
    println("Digite o primeiro número:")
    val num1 = readLine()!!.toInt()

    println("Digite o segundo número:")
    val num2 = readLine()!!.toInt()

    println("Digite o terceiro número:")
    val num3 = readLine()!!.toInt()

    println("Digite o quarto número:")
    val num4 = readLine()!!.toInt()

    val resultado1 = num1 * num1
    val resultado2 = num2 * num2
    val resultado3 = num3 * num3
    val resultado4 = num4 * num4

    if(resultado3 >= 1000){

        println("O resultado é = $resultado3")

    } else{

        println("O resultado é = $resultado1")
        println("O resultado é = $resultado2")
        println("O resultado é = $resultado3")
        println("O resultado é = $resultado4")

    }



}
