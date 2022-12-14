package main.kotlin.br.com.alura.bytebank.tests

fun testaTipoFuncaoClasse() {
    val minhaFuncaoClasse: (Int, Int) -> Int = Soma()
    println(minhaFuncaoClasse(30, 5))
}

fun testaTipoFuncaoReferencia() {
    val minhaFuncao: (Int, Int) -> Int = ::soma
    println(minhaFuncao(60, 20))
}

fun soma(a: Int, b: Int): Int { return a + b }

class Soma : (Int, Int) -> Int {
    override fun invoke(a: Int, b: Int): Int {
        return a + b
    }
}

val minhaFuncaoLambda = {
    println("Executa função lambda")
}

val minhaFuncaoAnonima: () -> Unit = fun() {
    println("Executa função anonima")
}