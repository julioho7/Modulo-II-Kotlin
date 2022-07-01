package one.digitalInnovation.collections

fun main() {
    val values = IntArray(5) //iniciando o array com o tamanho dele

    values[0] = 1 //Colocando valor dentro das posições do Array
    values[1] = 7
    values[2] = 6
    values[3] = 3
    values[4] = 2

    println("-----------------------------------------------------------------------------")
    for(valor in values){
        println(valor)
    }

    println("-----------------------------------------------------------------------------")
    values.forEach {
        println(it)
    }

    println("-----------------------------------------------------------------------------")
    values.forEach { valor ->
        println(valor)
    }

    println("-----------------------------------------------------------------------------")
    println("Impressão por valor do index")
    for (index in values.indices){
        //println(index)
        println("O valor de index é: $index e o valor de sua posição é: ${values[index]}")
    }

    println("-----------------------------------------------------------------------------")
    println("Impressão por valor crescente")
    values.sort() //O sort ordena, por padrão, do menor para o maior
    for (valor in values){
        println(valor)
    }
}