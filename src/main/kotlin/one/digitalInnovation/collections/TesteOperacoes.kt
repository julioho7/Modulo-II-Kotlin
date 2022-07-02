package one.digitalInnovation.collections

fun main() {
    val salarios = doubleArrayOf(1000.0, 2501.0, 4000.0)

    for(salario in salarios){
        println(salario)
    }

    println("--------------------------------------")
    println("Média dos salários: R$%.2f".format(salarios.average()))
    println("Maior salalário: R$%.2f".format(salarios.maxOrNull()))
    println("Menor salalário: R$%.2f".format(salarios.minOrNull()))

    println("--------------------------------------")
    val filtroSalariosMaiores = salarios.filter { it > 2500.0 }
    println("Os salários maiores que R$2500,00 são: ")
    filtroSalariosMaiores.forEach { println("R$%.2f".format(it)) }
}