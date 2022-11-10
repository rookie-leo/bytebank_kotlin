package main.kotlin

class Gerente (
    var nome: String,
    val cpf: String,
    val senha: Int
) {
    var salario = 0.0

    fun bonificacao(): Double {
        salario += salario * 0.2
        return salario
    }

    fun autentica(senha: Int): Boolean {
        return this.senha == senha
    }
}