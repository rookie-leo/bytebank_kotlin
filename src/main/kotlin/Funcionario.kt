package main.kotlin

class Funcionario(nome: String, cpf: String) {
    var salario = 0.0

    fun bonificacao(): Double {
        salario += salario * 0.10
        return salario
    }

}