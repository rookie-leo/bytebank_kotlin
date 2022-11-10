package main.kotlin

class Funcionario(
    var nome: String,
    val cpf: String
) {
    var salario = 0.0

    fun bonificacao(): Double {
        salario += salario * 0.1
        return salario
    }
}