package one.digitalInnovation.collections

fun main() {
    val nomes = Array(6){" "}

    nomes[0] = "Julio"
    nomes[1] = "Ana"
    nomes[2] = "Isaac"
    nomes[3] = "Jackson"
    nomes[4] = "Juliane"
    nomes[5] = "Jonathan"

    var ordem = 1
    for (lista in nomes){
        println("$ordem. $lista")
        ordem += 1
    }

    println("-------------------------------------------")
    ordem = 1
    nomes.sort() //Aqui ele irá ordenar o Array, agora com String, em ordem alfabética.
    nomes.forEach{
        println("$ordem. $it")
        ordem += 1
    }

    println("\nO tamanho da sua lista é ${ordem - 1}")

    val nomes2 = arrayOf("Julio Henrique", "Ana Caroline")

    var ordem2 = 1
    println("----------------------------------------------")
    for(list in nomes2){
        println("$ordem2. $list")
        ordem2 += 1
    }

    nomes2.sort()
    ordem2 = 1

    println("-----------------------------------------------")
    nomes2.forEach {
        println("$ordem2. $it")
        ordem2 += 1
    }
}