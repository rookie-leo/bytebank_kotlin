package main.kotlin.br.com.alura.bytebank.models

class ContaPoupanca(
    titular: Cliente,
    numero: Int
): Conta(
    titular,
    numero
) {
    override fun saca(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        } else {
            println("Saldo insuficiente!")
        }
    }
}