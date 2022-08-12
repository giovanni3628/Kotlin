//1) João, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho.
// Toda vez que ele traz um peso de tomate maior que o estabelecido pelo regulamento do
// estado de São Paulo (50 quilos)
// deve pagar um multa de R$ 4,00 por quilo excedente. João precisa que você faça um sistema que
// leia a variável P (peso de tomates) e verifique se há excesso. Se houver,
// gravar na variável E (Excesso) e na variável M o valor da multa que João deverá pagar.
// Caso contrário mostrar tais variáveis com o conteúdo ZERO.
fun main() {

    var excesso: Int
    var multa: Int

    println("Digite o peso dos tomates:")
    val p: Int = readln().toInt()

    excesso = p - 50
    multa = excesso * 4

    if(p > 50){
        multa = excesso * 4
        println("O peso está em excesso. Multa de 4 reais por kg de excesso")
        println("A sua multa é de: $multa")
    }else{
        println("Não há excesso de peso")
        excesso = 0
        multa = 0
    }
}
