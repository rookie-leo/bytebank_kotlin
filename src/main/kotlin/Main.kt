import main.kotlin.Conta

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
