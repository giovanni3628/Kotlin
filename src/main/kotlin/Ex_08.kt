//8) Construa um sistema para ler uma variável numérica N e imprimi-la somente se a mesma for maior que 100,
// caso contrário imprimi-la com o valor zero.
fun main() {

    println("Digite um número: ")
    var numero = readLine()!!.toInt()

    if(numero > 100){
        println("O número que você digitou é $numero")
    }else{
        numero = 0
        println("O número é $numero")
    }




}
