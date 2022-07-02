package one.digitalInnovation.collections

fun main() {
    val salarios = doubleArrayOf(1000.0, 2501.0, 4000.0)

    for(salario in salarios){
        //Print simples do salário do Array
        println("R$ $salario")
    }

    println("--------------------------------------")
    //Print da média, do maior e no menor valor do Array
    println("Média dos salários: R$%.2f".format(salarios.average()))
    println("Maior salalário: R$%.2f".format(salarios.maxOrNull()))
    println("Menor salalário: R$%.2f".format(salarios.minOrNull()))

    println("--------------------------------------")
    //Filtro dos salários do Array que são maiores que o valor estípulado
    val filtroSalariosMaiores = salarios.filter { it > 2500.0 }
    println("Os salários maiores que R$2500,00 são: ")
    filtroSalariosMaiores.forEach { println("R$%.2f".format(it)) }

    println("--------------------------------------")
    //Filtro dos salários do Array que estão no intervalo estípulado - Método normal
    val filtroSalariosEntreValores = salarios.filter { it > 2500.0 && it < 5000.00 }
    println("Os salários maiores que R$2500,00 são: ")
    filtroSalariosEntreValores.forEach { println("R$%.2f".format(it)) }

    println("--------------------------------------")
    //Filtro dos salários do Array que estão no intervalo estípulado - Método range
    //Contador da quantidade de salários que estão no intervalo estipulado
    println("O total de salários no intervalo são: ${salarios.count{it in 2000.0..5000.0}}")
    val filtroSalariosEntreValores2 = salarios.filter { it in 2000.0..5000.00 }
    filtroSalariosEntreValores2.forEach { println("R$%.2f".format(it)) }
}