import main.kotlin.br.com.alura.bytebank.models.Endereco

fun main() {
    val testeFuncao: () -> Unit
    Endereco().let {
        it
    }

    "world".let(::testaReceberString)

    1.let { it }
}

fun testaReceberString(str: String){ println("Hello $str") }

fun teste(teste: Int, bloco: () -> Unit) {}