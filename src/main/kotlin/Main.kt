import main.kotlin.Conta
import main.kotlin.Funcionario

fun main() {

    val funcionario = Funcionario("Kratos", "01234567885", 2)
    funcionario.salario = 1000.00

    println("Funcionário: ${funcionario.nome}")
    println("CPF: ${funcionario.cpf}")
    println("Salario: ${funcionario.salario}")
    println("Salario com bonificação: ${funcionario.bonificacao()}")

}
