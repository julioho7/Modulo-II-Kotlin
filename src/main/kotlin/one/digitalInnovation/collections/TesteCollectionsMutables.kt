package one.digitalInnovation.collections

fun main() {
    val funcionario1 = Funcionario("João", 2000.0, "CLT")
    val funcionario2 = Funcionario("Pedro", 1500.0, "PJ")
    val funcionario3 = Funcionario("Maria", 4000.0, "CLT")

    println("\n------------------ LIST -------------------")
    val funcionarios = mutableListOf(funcionario1, funcionario3)
    funcionarios.forEach { println(it) }

    println("-------------------------------------------")
    funcionarios.add(funcionario2)
    funcionarios.forEach { println(it) }

    println("-------------------------------------------")
    funcionarios.remove(funcionario1)
    funcionarios.forEach { println(it) }

    println("\n----------------- SET ---------------------")
    val funcionariosSet = mutableSetOf(funcionario1)
    funcionariosSet.forEach { println(it) }

    println("-------------------------------------------")
    funcionariosSet.add(funcionario2)
    funcionariosSet.add(funcionario3)
    funcionariosSet.forEach{ println(it) }

    println("-------------------------------------------")
    funcionariosSet.remove(funcionario3)
    funcionariosSet.forEach { println(it) }

}