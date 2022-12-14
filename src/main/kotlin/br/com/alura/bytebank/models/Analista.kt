package main.kotlin.br.com.alura.bytebank.models

class Analista(
    nome: String,
    cpf: String,
    salario: Double
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
) {
    override val bonificacao: Double
        get() {
            salario += salario * 0.2
            return salario
        }
}