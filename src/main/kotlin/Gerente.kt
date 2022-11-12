package main.kotlin

class Gerente(
    nome: String,
    cpf: String,
    val senha: Int
) : Funcionario(
    nome = nome,
    cpf = cpf
) {
    override var salario = 0.0

    override val bonificacao: Double
        get() {
            salario += salario * 0.2
            return salario
        }

    fun autentica(senha: Int): Boolean {
        return this.senha == senha
    }
}