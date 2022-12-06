package main.kotlin.br.com.alura.bytebank.tests

fun testaExpressoes() {
    val entrada: String = "1.a"

    val valorRecebido: Double? = try {
        entrada.toDouble()
    } catch (ex: NumberFormatException) {
        println("Houve um problema na conversão do valor digitado")
        ex.printStackTrace()
        null
    }

    val valorComTaxa: Double? = if (valorRecebido != null) {
        valorRecebido + 0.1
    } else {
        null
    }
}