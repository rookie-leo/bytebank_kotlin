package main.kotlin.br.com.alura.bytebank.models

class Cliente(
    var nome: String,
    val cpf: String,
    val senha: Int
) : Autenticavel {
    override fun autentica(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }
}