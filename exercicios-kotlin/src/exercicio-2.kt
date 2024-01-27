// Crie um programa que printa números ímpares de 0 a 100


fun main() {
    for (numero in 1..100) {
        if (numero % 2 == 1){
            println(numero)
        }
    }
}