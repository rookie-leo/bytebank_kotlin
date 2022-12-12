package main.kotlin.br.com.alura.bytebank.tests.collections

fun testaMap() {
    val pedidos = mutableMapOf(
        Pair(1, 20.0),
        Pair(2, 50.50),
        3 to 35.99,
        4 to 100.00,
        5 to 100.00,
        6 to 20.00
    )
    println(pedidos.getOrElse(5) {
        "Valor não encontrado!"
    })

    println(pedidos.getOrDefault(1, -1.0))
    println(pedidos.getOrDefault(0, -1.0))

    for (numero in pedidos.keys) {
        println("Pedido $numero")
    }

    for (valor in pedidos.values) {
        println("Valore $valor")
    }

    println(pedidos.filter { (numero, valor) ->
        numero % 2 == 0 && valor > 50.0
    })

    println(pedidos.filterValues { valor ->
        valor > 200.00
    })

    println(pedidos.filterKeys { numero ->
        numero % 2 == 1
    })

    println(pedidos + mapOf(7 to 90.0, 8 to 20.0))
    println(pedidos)

    println(pedidos - listOf(6, 5))
    println(pedidos)

//    pedidos.putAll(listOf<Pair<Int,Double>>(7 to 90.0, 8 to 20.0, 8 to 30.0))
    pedidos += listOf<Pair<Int,Double>>(7 to 90.0, 8 to 20.0, 8 to 30.0)
    println(pedidos)

    pedidos.keys.remove(1)
    println(pedidos)

    pedidos.values.remove(50.0)
    println(pedidos)

    pedidos.values.remove(100.0)
    println(pedidos)

    pedidos -= 6
    println(pedidos)
}

fun funcoesBasicas(pedidos: MutableMap<Int, Double>) {
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