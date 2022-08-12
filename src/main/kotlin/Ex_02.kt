//2) Elabore um sistema que leia as variáveis C e N, respectivamente código
// e número de horas trabalhadas de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora.
// Quando o número de horas exceder a 50 calcule o excesso de pagamento armazenando-o na variável E,
// caso contrário zerar tal variável. A hora excedente de trabalho vale R$ 20,00.
// No final do processamento imprimir o salário total e o salário excedente.
fun main() {

    println("Digite o seu código:")
    val codigo = readLine()!!.toInt()

    println("Digite quantas horas você trabalhou:")
    val horasTrabalhadas = readLine()!!.toInt()

    val salario: Int
    val horaExtra: Int
    val salarioExtra: Int
    val salarioTotal: Int

    salario = 10 * 50

    if(horasTrabalhadas > 50){

        horaExtra = horasTrabalhadas - 50
        salarioExtra = horaExtra * 20
        salarioTotal = salario + salarioExtra

        println("Você trabalhou $horaExtra horas extras")
        println("Seu salário normal é de : $salario")
        println("Seu salário extra é de : $salarioExtra")
        println("Seu salário total é de : $salarioTotal")

    }else{
        println("Seu salário é de : $salario")
    }






}
