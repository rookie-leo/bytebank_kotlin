import main.kotlin.Conta
import main.kotlin.Funcionario

fun main() {

    val funcionario = Funcionario("Kratos", "01234567885")
    funcionario.salario = 1000.00

    println(funcionario.bonificacao())

}
