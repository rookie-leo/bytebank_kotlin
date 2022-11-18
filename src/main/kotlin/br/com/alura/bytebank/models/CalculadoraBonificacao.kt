package main.kotlin.br.com.alura.bytebank.models

class CalculadoraBonificacao {

    var total = 0.0
        private set

    fun registra(funcionario: Any) {
        funcionario as Funcionario
        this.total += funcionario.bonificacao
    }
}