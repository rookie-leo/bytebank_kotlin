fun main() {
    println("Bem vindo ao ByteBank!")

    val conta1 = Conta()
    conta1.titular = "Baptista"
    conta1.numero = 1000
    conta1.saldo = 200.00

    val conta2 = Conta()
    conta2.titular = "Mercy"
    conta2.numero = 1001
    conta2.saldo = 300.00

    println("Titular da conta ${conta1.titular}")
    println("Titular da conta ${conta1.numero}")
    println("Titular da conta ${conta1.saldo}")

    println("Titular da conta ${conta2.titular}")
    println("Titular da conta ${conta2.numero}")
    println("Titular da conta ${conta2.saldo}")

    var conta = conta1
    println("Titular conta: ${conta.titular}")//Titular conta: Baptista
    conta.titular = "D.Va"
    println("Titular conta: ${conta.titular}")//Titular conta: D.Va
    println("Titular conta1: ${conta1.titular}")//Titular conta: D.Va

}

class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0
}

private fun testaCondicionais(saldo: Double, titular: String, numeroConta: Int) {
    var saldo1 = saldo
    println("Adicionando valor na conta!")
    saldo1 += 250.0

    println("Titular da conta $titular")
    println("Número da conta $numeroConta")
    println("Saldo em conta $saldo1")

    saldoEmContaIf(saldo1)

    println("Sacando valor na conta!")
    saldo1 -= 250.0

    saldoEmContaWhen(saldo1)

    println("Sacando valor na conta!")
    saldo1 -= 250.0

    saldoEmContaIf(saldo1)
}

private fun testaLaco() {
    println()
    println("Cira conta com FOR")
    criaContaFor()

    println()
    println("Cira conta com WHILE")
    criaContaWhile()

    testaFor()
}

private fun testaFor() {
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