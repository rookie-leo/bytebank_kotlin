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

val calculaBonificacaoLambda: (salario: Double) -> Double = lambda@ {
    if (it > 1000.0) return@lambda it + 50
    it + 100.0
}

val calculaBonificacaoAnonima: (salario: Double) -> Double = fun(salario): Double {
    if (salario > 1000.0) return salario + 50
    return salario + 100.0
}

class Soma : (Int, Int) -> Int {
    override fun invoke(a: Int, b: Int): Int {
        return a + b
    }
}

val minhaFuncaoLambda = { a: Int, b: Int ->
    a + b
}

val minhaFuncaoAnonima = fun(a: Int, b: Int): Int {
    return a + b
}
