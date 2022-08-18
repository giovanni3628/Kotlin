fun main() {

    println("Digite o primeiro número: ")
    val n1 = readln().toInt()

    println("Digite o segundo número: ")
    val n2 = readln().toInt()

    println("Digite 1 - Somar | 2 - Multiplicar | 3 - Subtrair | 4 - Dividir ")
    val operacao = readln().toInt()


    if (operacao == 1){
        println("A soma dos números é: ${somar(n1, n2)}")
    }else if (operacao == 2){
        println("A multiplicação dos números é: ${multiplicar(n1, n2)}")
    }else if (operacao == 3){
        println("A subtração dos números é: ${subtrair(n1, n2)}")
    }else if (operacao == 4){
        println("A divisão dos números é: ${dividir(n1, n2)}")
    }

}
