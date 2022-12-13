fun main() {
    val minhaFuncao = :: teste
    println(minhaFuncao())

    val minhaFuncaoClasse: () -> Unit = Teste()
    println(minhaFuncaoClasse())
}

fun teste() { println("Executa função teste") }

class Teste : () -> Unit {
    override fun invoke() {
        println("Executa invoke da classe Teste")
    }
}