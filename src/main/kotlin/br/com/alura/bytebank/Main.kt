import main.kotlin.br.com.alura.bytebank.models.Endereco

fun main() {
    Endereco(logradouro = "Av Voluntarios da Patria", numero = 5035, cidade = "São Paulo")
        .let {
            "${it.logradouro}, ${it.numero}, ${it.cidade}".uppercase()
        }.let(::println)

    listOf(
        Endereco(complemento = "casa",logradouro = "Av Voluntarios da Patria"),
        Endereco(logradouro = "Av Voluntarios da Patria"),
        Endereco(complemento = "Apartamento", logradouro = "Av Voluntarios da Patria"),
        Endereco(logradouro = "Av Voluntarios da Patria"),
        Endereco(complemento = " ", logradouro = "Av Voluntarios da Patria")
    )
        .filter { it.complemento.isNotEmpty() && it.complemento.isNotBlank() }
        .let(::println)
}
