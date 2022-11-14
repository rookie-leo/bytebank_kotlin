package main.kotlin.br.com.alura.bytebank.models

class Diretor(
    nome: String,
    cpf: String,
    senha: Int,
    salario: Double,
    var plr: Double
) : FuncionarioAdmin(
    nome = nome,
    cpf = cpf,
    senha = senha,
    salario = salario
) {
    override val bonificacao: Double
        get() {
            salario += plr + (salario * 0.3)
            return salario
        }
}