import main.kotlin.*
import main.kotlin.br.com.alura.bytebank.exceptions.SaldoInsuficienteException
import main.kotlin.br.com.alura.bytebank.models.*
import main.kotlin.br.com.alura.bytebank.tests.testaEndereco
import main.kotlin.br.com.alura.bytebank.tests.testaObjeto

fun main() {

    println("início main")

    testaContasDiferentes()

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
        val endereco = Any()
        throw SaldoInsuficienteException()
    }
    println("fim funcao2")
}


