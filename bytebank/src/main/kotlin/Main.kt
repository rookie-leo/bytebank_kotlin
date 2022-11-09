fun main() {
    println("Bem vindo ao ByteBank!")

    val conta1 = Conta(numero = 1000, titular = "Baptista")
    conta1.deposita(-200.00)

    val conta2 = Conta("Mercy", 1001)
    conta2.deposita(200.00)

    println("Titular da conta ${conta1.titular}")
    println("Numero da conta ${conta1.numero}")
    println("Saldo da conta ${conta1.saldo}")

    println("Titular da conta ${conta2.titular}")
    println("Numero da conta ${conta2.numero}")
    println("Saldo da conta ${conta2.saldo}")

    println("Depositando na conta1")
    conta1.deposita(15.00)
    println("Saldo da conta ${conta1.saldo}")

    println("Depositando na conta2")
    conta2.deposita(50.00)
    println("Saldo da conta ${conta2.saldo}")

    println("Sacando da conta1")
    conta1.saca(100.00)
    println("Saldo ${conta1.saldo}")

    println("Sacando da conta2")
    conta2.saca(10000.00)
    println("Saldo ${conta2.saldo}")

    println("Tranferindo valor da conta1 para a conta 2")
    conta1.transfere(conta = conta2, valor= 60.40)
    println("Saldo conta 1 ${conta1.saldo}")
    println("Saldo conta 2 ${conta2.saldo}")
}

class Conta(
    var titular: String,
    var numero: Int
) {
    var saldo = 0.0
        private set

    fun saca(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        } else {
            println("Saldo insuficiente!")
        }
    }

    fun deposita(valor: Double) {
        if (valor > 0) this.saldo += valor
        else println("Não é possivel depositar valores negativos!")
    }

    fun transfere(conta: Conta, valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
            conta.deposita(valor)
            println("Valor transferido com sucesso!")
        } else {
            println("Saldo insuficiente!")
        }
    }
}

private fun testaCopiaEReferencia(conta1: Conta) {
    var conta = conta1
    println("Titular conta: ${conta.titular}")//Titular conta: Baptista
    conta.titular = "D.Va"
    println("Titular conta: ${conta.titular}")//Titular conta: D.Va
    println("Titular conta1: ${conta1.titular}")//Titular conta: D.Va
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