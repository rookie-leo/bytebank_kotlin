package main.kotlin

open class Funcionario(
    var nome: String,
    val cpf: String
) {
    open var salario = 0.0

    open fun bonificacao(): Double {
        salario += salario * 0.1
        return salario
    }
}