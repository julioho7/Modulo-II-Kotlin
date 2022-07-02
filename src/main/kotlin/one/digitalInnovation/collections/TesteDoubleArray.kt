package one.digitalInnovation.collections

fun main() {
    val salarios = DoubleArray(3)

    salarios[0] = 1000.00
    salarios[1] = 3000.00
    salarios[2] = 500.00

    salarios.forEach { println(it) }

    println("-----------------------------------------------")
    println("Aumento no salário de 10%")
    salarios.forEachIndexed{index, salario ->
        salarios[index] = salario * 1.1
        println(salarios[index])
    }

    val salarios2 = doubleArrayOf(1500.0, 1250.0, 5000.0)
    println("-----------------------------------------------")
    println("Exemplo de doubleArrayOf")
    salarios2.sort()
    salarios2.forEach { println(it) }
}