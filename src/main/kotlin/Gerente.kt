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
            return super.bonificacao + (salario * 0.2)
        }

    fun autentica(senha: Int): Boolean {
        return this.senha == senha
    }
}