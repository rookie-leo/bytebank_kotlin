import main.kotlin.br.com.alura.bytebank.models.Autenticavel
import main.kotlin.br.com.alura.bytebank.models.Endereco
import main.kotlin.br.com.alura.bytebank.models.SistemaInterno

fun main() {
    Endereco(logradouro = "Av Voluntarios da Patria", numero = 5035, cidade = "São Paulo")
        .run {
            "$logradouro, $numero, $cidade".uppercase()
        }.let(::println)

    listOf(
        Endereco(complemento = "casa",logradouro = "Av Voluntarios da Patria"),
        Endereco(logradouro = "Av Voluntarios da Patria"),
        Endereco(complemento = "Apartamento", logradouro = "Av Voluntarios da Patria"),
        Endereco(logradouro = "Av Voluntarios da Patria"),
        Endereco(complemento = " ", logradouro = "Av Voluntarios da Patria")
    )
        .filter { it.complemento.isNotEmpty() }
        .let(::println)

    soma(1, 2, resultado = (::println))

    val autenticavel = object : Autenticavel {
        val senha = 1234
        override fun autentica(senha: Int) = this.senha == senha
    }

    SistemaInterno().entra(autenticavel, 1234, autenticado = {
        println("Realizar pagamento")
    })
}

fun soma(a: Int, b: Int, resultado: (Int) -> Unit) {
    resultado(a + b)
}