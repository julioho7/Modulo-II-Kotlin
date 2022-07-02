package one.digitalInnovation.collections

fun main() {
    val funcionario1 = Funcionario("João", 2000.0, "CLT")
    val funcionario2 = Funcionario("Pedro", 1500.0, "PJ")
    val funcionario3 = Funcionario("Maria", 4000.0, "CLT")

    val setFuncionario1 = setOf(funcionario1, funcionario2)
    val setFuncionario2 = setOf(funcionario3)

    //Comando para unir os Sets separados
    println("União dos setOfs:")
    val resultUnion = setFuncionario1.union(setFuncionario2)
    resultUnion.forEach { println(it) }

    println("------------------------------------------------------------")
    println("Subtração dos setOf selecionados:")
    val setFuncionario3 = setOf(funcionario1, funcionario2, funcionario3)
    val resultSubtraction = setFuncionario3.subtract(setFuncionario2)
    resultSubtraction.forEach { println(it) }

    println("------------------------------------------------------------")
    println("Intercessão dos setOf selecionados:")
    val resultIntercect = setFuncionario3.intersect(setFuncionario2)
    resultIntercect.forEach { println(it) }

}