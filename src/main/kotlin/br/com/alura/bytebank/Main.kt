fun main() {
//    testaTipoFuncaoReferencia()
//    testaTipoFuncaoClasse()

//    println(minhaFuncaoLambda(10, 15))
//    println(minhaFuncaoAnonima(30, 45))

    val calculaBonificacaoLambda: (salario: Double) -> Double = lambda@ {
        if (it > 1000.0) return@lambda it + 50
        it + 100.0
    }

    println(calculaBonificacaoLambda(1000.0))

    val calculaBonificacaoAnonima: (salario: Double) -> Double = fun(salario): Double {
        if (salario > 1000.0) return salario + 50
        return salario + 100.0
    }

    println(calculaBonificacaoAnonima(1001.0))
}

