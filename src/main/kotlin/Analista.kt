package main.kotlin

class Analista(
    nome: String,
    cpf: String
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
}