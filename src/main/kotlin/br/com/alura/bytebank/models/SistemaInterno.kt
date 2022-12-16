package main.kotlin.br.com.alura.bytebank.models

class SistemaInterno {

    fun entra(admin: Autenticavel, senha: Int, autenticado: () -> Unit = {}) {
        if (admin.autentica(senha)) {
            println("Bem vindo ao Bytebank")
            autenticado()
        } else {
            println("Falha na autenticação")
        }
    }
    fun entraReceiver(admin: Autenticavel, senha: Int, autenticado: SistemaInterno.() -> Unit = {}) {
        if (admin.autentica(senha)) {
            println("Bem vindo ao Bytebank")
            autenticado(this)
        } else {
            println("Falha na autenticação")
        }
    }

    fun pagamento() {
        println("Teste: Realizando pagamento")
    }
}