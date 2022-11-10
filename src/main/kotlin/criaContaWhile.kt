package main.kotlin

fun criaContaWhile() {
    var i = 0
    while (i < 5) {
        val titular = "Kratos $i"
        val numeroConta = 1000 + i
        var saldo = 0.0 + i

        println("Titular da conta $titular")
        println("Número da conta $numeroConta")
        println("Saldo em conta $saldo")
        println()
        i++
    }
}