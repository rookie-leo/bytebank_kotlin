import main.kotlin.Diretor
import main.kotlin.Funcionario
import main.kotlin.Gerente

fun main() {

    val kratos = Funcionario("Kratos", "01234567885")
    kratos.salario = 1000.00
    println("Funcionário: ${kratos.nome}")
    println("CPF: ${kratos.cpf}")
    println("Salario: ${kratos.salario}")
    println("Salario com bonificação: ${kratos.bonificacao}")

    println()

    val kora = Gerente("Kora", "98765432105", 1234)
    kora.salario = 1000.00
    println("Gerente: ${kora.nome}")
    println("CPF: ${kora.cpf}")
    println("Salario: ${kora.salario}")
    println("Salario com bonificação: ${kora.bonificacao}")

    if(kora.autentica(1234)) {
        println("Autenticado com sucesso!")
    } else {
        println("Falha na autenticação!")
    }

    println()

    val naruto = Diretor("Naruto", "45678932145", 1172, 200.00)
    naruto.salario = 1000.00
    naruto.plr = 200.00
    println("Diretor: ${naruto.nome}")
    println("CPF: ${naruto.cpf}")
    println("Salario: ${naruto.salario}")
    println("Participação de lucro rotativo: ${naruto.plr}")
    println("Salario com bonificação: ${naruto.bonificacao}")

    if(naruto.autentica(1172)) {
        println("Autenticado com sucesso!")
    } else {
        println("Falha na autenticação!")
    }

}
