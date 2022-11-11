package main.kotlin

open class Funcionario(
    var nome: String,
    val cpf: String
) {
    open var salario = 0.0

    open val bonificacao: Double get() = (salario * 0.1) + salario

}