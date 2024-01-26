// Crie um programa que receba um número e diga se ele é par ou ímpar

fun main() {
// Input do numero
    print("Digite um número: ")
    val parOuImpar = readLine()!!.toInt()

// Verificar se o numero é par ou impar utilizando a operação %
    if (parOuImpar % 2 == 0) {
        println("$parOuImpar é um número par.")
    } else {
        println("$parOuImpar é um número ímpar.")
    }
}
