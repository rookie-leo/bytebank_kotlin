package main.kotlin.br.com.alura.bytebank.models

class SistemaInterno {

    fun entra(admin: Autenticavel, senha: Int) {
        if (admin.autentica(senha)) {
            println("Bem vindo ao Bytebank")
        } else {
            println("Falha na autenticação")
        }
    }

}