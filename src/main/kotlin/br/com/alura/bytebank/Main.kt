fun main() {
    val minhaFuncaoLambda = {
        println("Executa função lambda")
    }

    val minhaFuncaoAnonima: () -> Unit = fun() {
        println("Executa função anonima")
    }

    minhaFuncaoLambda()
    minhaFuncaoAnonima()
}

