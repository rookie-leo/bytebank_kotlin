package main.kotlin.br.com.alura.bytebank.tests.collections

fun testaAssociacaoEAgrupamento() {
    val pedidos = listOf(
        Pedido(1, 40.0),
        Pedido(3, 70.50),
        Pedido(2, 35.90),
        Pedido(4, 50.0),
        Pedido(5, 60.0)
    )
    println(pedidos)

    val pedidosMapeados: Map<Int, Pedido> = pedidos.associateBy { pedido ->
        pedido.numero
    }
    println(pedidosMapeados)
    println(pedidosMapeados[3])

    val pedidosFreteGratis: Map<Pedido, Boolean> = pedidos.associateWith { pedido ->
        pedido.valor > 50.0
    }
    println(pedidosFreteGratis)
    println(pedidosFreteGratis[Pedido(numero = 2, valor = 59.99)])

    val pedidosFreteGratisAgrupados: Map<Boolean, List<Pedido>> = pedidos.groupBy { pedido: Pedido ->
        pedido.valor > 50.0
    }

    println(pedidosFreteGratisAgrupados)
    println(pedidosFreteGratisAgrupados[true])

    val nomes = listOf(
        "Alex",
        "Fran",
        "Gui",
        "Ana",
        "Paulo",
        "Maria",
        "Mario",
        "Gisele"
    )

    val agenda: Map<Char, List<String>> = nomes.groupBy { nome ->
        nome.first()
    }

    println(agenda)
    println(agenda['A'])
}

data class Pedido(val numero: Int, val valor: Double)