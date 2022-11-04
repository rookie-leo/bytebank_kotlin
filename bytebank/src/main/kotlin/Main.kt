fun main() {
    println("Bem vindo ao ByteBank!")

    val titular = "Kratos"
    val numeroConta = 1000
    var saldo = 0.0

    println("Titular da conta $titular")
    println("Número da conta $numeroConta")
    println("Saldo em conta $saldo")

    println("Adicionando valor na conta!")
    saldo += 250.0

    println("Titular da conta $titular")
    println("Número da conta $numeroConta")
    println("Saldo em conta $saldo")

    saldoEmContaIf(saldo)

    println("Sacando valor na conta!")
    saldo -= 250.0

    saldoEmContaWhen(saldo)

    println("Sacando valor na conta!")
    saldo -= 250.0

    saldoEmContaIf(saldo)

    println()
    println("Cira conta com FOR")
    criaContaFor()

    println()
    println("Cira conta com WHILE")
    criaContaWhile()

    for (i in 10 downTo 0) {
        println(i)
    }

    println()

    for (i in 10 downTo 0 step 2) {
        println(i)
    }
}

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

fun criaContaFor() {
    for (i in 1..5) {
        val titular = "Kratos $i"
        val numeroConta = 1000 + i
        var saldo = 0.0 + i

        println("Titular da conta $titular")
        println("Número da conta $numeroConta")
        println("Saldo em conta $saldo")
        println()
    }
}

fun saldoEmContaIf(saldo: Double) {
    if (saldo > 0.0) {
        println("Saldo em conta positivo")
    } else if (saldo == 0.0) {
        println("Saldo em conta zerado")
    } else {
        println("Saldo em conta negativo")
    }
}

fun saldoEmContaWhen(saldo: Double) {
    when {
        saldo > 0.0 -> println("Saldo em conta positivo")
        saldo == 0.0 -> println("Saldo em conta zerado")
        else -> println("Saldo em conta negativo")
    }
}