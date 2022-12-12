import main.kotlin.br.com.alura.bytebank.tests.collections.testaSet

fun main() {
    val pedidos = mutableMapOf(Pair(1, 20.0), Pair(2, 50.50), 3 to 35.99)
    println(pedidos)

    val pedido = pedidos[2]

    pedido?.let {
        println("Pedido $it")
    }

    var total = 0.0
    for (p: Map.Entry<Int, Double> in pedidos) {
        println("Numero do pedido ${p.key}")
        println("Valor do pedido ${p.value}")
        total += p.value
    }

    println("Valor total R$ $total")

    pedidos[5] = 95.0
    println(pedidos)

    pedidos.put(4, 10.55)
    println(pedidos)

    pedidos[1] = 35.40
    println(pedidos)

    pedidos.putIfAbsent(6, 100.0)
    println(pedidos)

    pedidos.putIfAbsent(6, 110.0)// Se o valor for igual, o metodo ignora
    println(pedidos)

    pedidos.remove(6)
    println(pedidos)

    pedidos.remove(3, 100.0)// Só irá remover, se o valor estiver de acordo com o parametro
    println(pedidos)
}

