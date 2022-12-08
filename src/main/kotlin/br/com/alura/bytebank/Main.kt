import main.kotlin.br.com.alura.bytebank.models.Endereco

fun main() {
    val endereco: Endereco? = Endereco(logradouro = "rua dos bobos")
    val logradouroNovo: String? = endereco?.logradouro

    endereco.let { println(it?.logradouro?.length) }

}




