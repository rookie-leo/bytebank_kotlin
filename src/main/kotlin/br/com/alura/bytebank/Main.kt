fun main() {
    val possuiContaCorrente = listOf("Mickey", "Sora", "Kairi", "Riku", "Donald", "Pateta")
    val possuiContaPoupanca = listOf("Mickey", "Riku", "Donald")
    val possuiAmbasContas = possuiContaCorrente + possuiContaPoupanca

    println(possuiAmbasContas)
    println(possuiAmbasContas.distinct())
}

