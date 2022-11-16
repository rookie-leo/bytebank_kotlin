import main.kotlin.*
import main.kotlin.br.com.alura.bytebank.models.*

fun main() {

    println("Bem vindo ao Bytebank")

    val objetoAnonimo = object : Autenticavel {
        val nome : String = "Izy"
        val cpf : String = "12345678985"
        val senha : Int = 1002

        override fun autentica(senha: Int) = this.senha == senha
    }

    val sistemaInterno = SistemaInterno()
    sistemaInterno.entra(objetoAnonimo, 1002)

    println("Cliente: ${objetoAnonimo.nome}")

    val cliente = Cliente(nome = "Bubble", cpf = "12345678985", senha = 3)
    val contaPoupanca = ContaPoupanca(titular = cliente, numero = 1000)
    val contaCorrente = ContaCorrente(titular = cliente, numero = 1001)

    testaContasDiferentes()

    println("Total de contas $totalContas")
}
