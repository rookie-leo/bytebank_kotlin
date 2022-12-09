package main.kotlin.br.com.alura.bytebank.models

class BancoDeNomes {
    val nomes: Collection<String> get() = dados

    companion object {
        private val dados = mutableListOf<String>()
    }

    fun salva(nome: String) {
        dados.add(nome)
    }
}