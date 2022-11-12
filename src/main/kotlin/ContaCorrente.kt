package main.kotlin

class ContaCorrente(
    titular: String,
    numero: Int
): Conta(
    titular,
    numero
) {

    override fun saca(valor: Double) {
        val valorComTaxa = valor + 0.1
        if (this.saldo >= valorComTaxa) {
            this.saldo -= valorComTaxa
        } else {
            println("Saldo insuficiente!")
        }
    }

    override fun deposita(valor: Double) {
        if (valor > 0) this.saldo += valor
        else println("Não é possivel depositar valores negativos!")
    }

}