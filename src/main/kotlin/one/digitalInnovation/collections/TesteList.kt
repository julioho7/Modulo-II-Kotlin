package one.digitalInnovation.collections

fun main() {
    val funcionario1 = Funcionario("João", 2000.0, "CLT")
    val funcionario2 = Funcionario("Pedro", 1500.0, "PJ")
    val funcionario3 = Funcionario("Maria", 4000.0, "CLT")

    val funcionarios = listOf(funcionario1, funcionario2, funcionario3)

    println("Printando todos os da lista na ordem que estão:")
    funcionarios.forEach { println(it) }

    println("-----------------------------------------------")
    println("Printando o nome setado: ")
    println(funcionarios.find { it.nome == "Maria" })

    println("-----------------------------------------------")
    println("Print de forma a ordenar por salário: ")
    funcionarios
        .sortedBy { it.salario }
        .forEach { println(it) } //Exemplo de encadeamento

    println("-----------------------------------------------")
    println("Print de forma para agrupar por tipo de contratação: ")
    funcionarios
        .groupBy { it.tipoContratacao }
        .forEach { println("$it\n") } //Exemplo de encadeamento

}

data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContratacao: String
){
    override fun toString(): String = """
        Nome: $nome | Salário: R$ %.2f
    """.trimIndent().format(salario)
}