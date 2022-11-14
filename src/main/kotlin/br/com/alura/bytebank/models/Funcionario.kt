package main.kotlin.br.com.alura.bytebank.models

abstract class Funcionario(
    var nome: String,
    val cpf: String,
    var salario: Double
) {
    abstract val bonificacao: Double

}