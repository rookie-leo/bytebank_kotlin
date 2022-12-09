fun main() {
    val possuiContaCorrente: Set<String> = setOf("Mickey", "Sora", "Kairi", "Riku", "Donald", "Pateta")
    val possuiContaPoupanca: Set<String> = setOf("Mickey", "Riku", "Donald")
    val possuiAmbasContas = mutableSetOf<String>()

    possuiAmbasContas.addAll(possuiContaCorrente)
    possuiAmbasContas.addAll(possuiContaPoupanca)

    possuiAmbasContas.add("Naminé")
    possuiAmbasContas.add("Naminé")

    println(possuiAmbasContas)
    println()

    println(possuiContaCorrente + possuiContaPoupanca)
    println(possuiContaCorrente union possuiContaPoupanca)

    println(possuiContaCorrente - possuiContaPoupanca)
    println(possuiContaCorrente subtract possuiContaPoupanca)

    println(possuiContaCorrente intersect possuiContaPoupanca)

    println()

    val possuiContaList = possuiAmbasContas.toMutableList()
    possuiContaList.add("Sora")
    println(possuiContaList)
    println(possuiContaList.toSet())
}

