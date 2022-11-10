package main.kotlin

class Diretor(
    nome: String,
    cpf: String,
    val senha: Int,
    var plr: Double
) : Funcionario(
    nome = nome,
    cpf = cpf,
) {
    override var salario = 0.0


    override fun bonificacao(): Double {
        salario += salario * 0.3
        return salario
    }

    fun autentica(senha: Int): Boolean {
        return this.senha == senha
    }
}