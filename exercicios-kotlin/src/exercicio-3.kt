// Crie um programa que printa números primos de 0 a 1000

fun isPrimo(number: Int): Boolean{
    if(number <= 1){
        return false
    }
    for(i in 2 until (number / 2)){
        if(number % i == 0){
            return false
        }
    }
    return true
}
fun main(){
    for(number in 0..1000){
        if(isPrimo(number)){
            println(number)
        }
    }
}