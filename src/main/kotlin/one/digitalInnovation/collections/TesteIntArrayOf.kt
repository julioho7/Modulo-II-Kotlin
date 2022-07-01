package one.digitalInnovation.collections

fun main() {
    val values = intArrayOf(2, 3, 4, 1, 10, 7) //Nesse caso, não precisa declarar o tamanho logo de início. Ele é mais flexível.

    values.forEach {
        println(it)

    }

    println("---------------------------------------------------")
    values.sort() //Irá organizar o Array, por padrão, em ordem crescente.
    values.forEach {
        println(it)

    }

}