fun main() {
    val possuiContaCorrente: Set<String> = setOf("Mickey", "Sora", "Kairi", "Riku", "Donald", "Pateta")
    val possuiContaPoupanca: Set<String> = setOf("Mickey", "Riku", "Donald")
    val possuiAmbasContas = mutableSetOf<String>()

    possuiAmbasContas.addAll(possuiContaCorrente)
    possuiAmbasContas.addAll(possuiContaPoupanca)

    possuiAmbasContas.add("Naminé")
    possuiAmbasContas.add("Naminé")

    println(possuiAmbasContas)
}

