package main.kotlin.br.com.alura.bytebank.models

abstract class FuncionarioAdmin(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int
): Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
), Autenticavel {

    abstract override val bonificacao: Double

    override fun autentica(senha: Int): Boolean{
        if(this.senha == senha) {
            return true
        }

        return false
    }

}