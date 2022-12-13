package main.kotlin.br.com.alura.bytebank.tests

fun testaTipoFuncaoClasse() {
    val minhaFuncaoClasse: () -> Unit = Teste()
    println(minhaFuncaoClasse())
}

fun testaTipoFuncaoReferencia() {
    val minhaFuncao = ::teste
    println(minhaFuncao())
}

fun teste() { println("Executa função teste") }

class Teste : () -> Unit {
    override fun invoke() {
        println("Executa invoke da classe Teste")
    }
}