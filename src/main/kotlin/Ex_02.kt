/*2 - Faça um programa em que o usuário digite o diâmetro de um círculo
 e calcule a área e o perímetro dele
 */
fun main() {

    println("Digite o raio do círculo:")
    val raioCirculo = readln().toInt()

    val pi =3.14
    var perimetro = 2 * pi * raioCirculo
    var area = pi * (raioCirculo * raioCirculo)

    println("O perímetro do círculo é de $perimetro")
    println("A área do círculo é de $area")

}