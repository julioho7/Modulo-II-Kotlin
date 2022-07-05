package one.digitalInnovation.collections

fun main() {
    val funcionario1 = Funcionario("João", 2000.0, "CLT")
    val funcionario2 = Funcionario("Pedro", 1500.0, "PJ")
    val funcionario3 = Funcionario("Maria", 4000.0, "CLT")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(funcionario1.nome, funcionario1)
    repositorio.create(funcionario2.nome, funcionario2)
    repositorio.create(funcionario3.nome, funcionario3)

    println(repositorio.findById(funcionario1.nome))

    println("----------------------------------------")
    repositorio.findAll().forEach { println(it) }

    println("----------------------------------------")
    repositorio.remove(funcionario2.nome)
    repositorio.findAll().forEach { println(it) }
}