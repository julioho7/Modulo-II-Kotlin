package one.digitalInnovation.collections

fun main() {
    val pair = Pair<String, Double>("João", 1000.0)
    val map1 = mapOf(pair)

    map1.forEach { (k, v) -> println("Chave: $k - Valor: %.2f".format(v))  }

    println("--------------------------------------------------------------")
    val map2 = mapOf(
        "Pedro" to 2500.0,
        "Maria" to 3000.0
    )
    map2.forEach { (k, v) -> println("Chave: $k - Valor: %.2f".format(v))}
}