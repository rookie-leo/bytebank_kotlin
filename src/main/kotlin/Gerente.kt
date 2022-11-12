package main.kotlin

class Gerente(
    nome: String,
    cpf: String,
    senha: Int,
    salario: Double
) : FuncionarioAdmin(
    nome = nome,
    cpf = cpf,
    senha = senha,
    salario = salario
) {
    override val bonificacao: Double
        get() {
            salario += salario * 0.2
            return salario
        }
}