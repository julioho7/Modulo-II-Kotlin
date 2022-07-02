package one.digitalInnovation.collections

fun main() {
    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0)

    for(salario in salarios){
        println(salario)
    }

    println("--------------------------------------")
    println("Média dos salários: %.2f".format(salarios.average()))
    println("Maior salalário: %.2f".format(salarios.maxOrNull()))
    println("Menor salalário: %.2f".format(salarios.minOrNull()))

    println("--------------------------------------")
    val filtroSalariosMaiores = salarios.filter { it > 2500.0 }
    filtroSalariosMaiores.forEach { println("%.2f".format(it)) }
}