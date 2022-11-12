package main.kotlin

abstract class Funcionario(
    var nome: String,
    val cpf: String,
    var salario: Double
) {
    abstract val bonificacao: Double

}