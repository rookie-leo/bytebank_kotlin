import main.kotlin.*
import main.kotlin.br.com.alura.bytebank.models.*
import main.kotlin.br.com.alura.bytebank.tests.testaEndereco
import main.kotlin.br.com.alura.bytebank.tests.testaObjeto

fun main() {

    println("início main")

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



    funcao1()
    println("fim main")
}

fun funcao1(){
    println("início funcao1")
    funcao2()
    println("fim funcao1")
}

fun funcao2() {
    println("início funcao2")
    for (i in 1..5){
        println(i)
    }
    println("fim funcao2")
}


