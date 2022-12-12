import main.kotlin.br.com.alura.bytebank.tests.collections.testaSet

fun main() {
    val pedidos = mapOf(Pair(1, 20.0), Pair(2, 50.50), 3 to 35.99)
    println(pedidos)

    val pedido = pedidos[2]

    pedido?.let {
        println("Pedido $it")
    }

    var total = 0.0
    for (pedido: Map.Entry<Int, Double> in pedidos) {
        println("Numero do pedido ${pedido.key}")
        println("Valor do pedido ${pedido.value}")
        total += pedido.value
    }

    println("Valor total R$ $total")
}

