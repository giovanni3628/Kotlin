/* 1- O usuário digitará sua idade
e o programa deverá printar o ano em que ele nasceu.
 */
fun main() {

    println("Digite sua idade:")
    val idade = readln().toInt()

    var anoNascimento = 2022 - idade

    println("O ano que você nasceu é: $anoNascimento")

}