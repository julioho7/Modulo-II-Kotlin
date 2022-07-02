package one.digitalInnovation.collections

fun main() {
    val funcionario1 = Funcionario("João João", 1000.0)
    val funcionario2 = Funcionario("Pedro Pedro", 2000.0)
    val funcionario3 = Funcionario("Maria Maria", 4000.0)

    val funcionarios = listOf(funcionario1, funcionario2, funcionario3)

    funcionarios.forEach { println(it) }

    println("-----------------------------------------------")
    println(funcionarios.find { it.nome == "Maria Maria" })

}

data class Funcionario(
    val nome: String,
    val salario: Double
){
    override fun toString(): String = """
        Nome: $nome
        Salário: R$ %.2f

    """.trimIndent().format(salario)
}