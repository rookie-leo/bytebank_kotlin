import main.kotlin.*

fun main() {

    val kakashi = Funcionario("Kakashi", "01234567885")
    kakashi.salario = 1000.00
    println("Funcionário: ${kakashi.nome}")
    println("CPF: ${kakashi.cpf}")
    println("Salario: ${kakashi.salario}")
    println("Salario com bonificação: ${kakashi.bonificacao}")

    println()

    val hinata = Gerente("Hinata", "98765432105", 1234)
    hinata.salario = 2000.00
    println("Gerente: ${hinata.nome}")
    println("CPF: ${hinata.cpf}")
    println("Salario: ${hinata.salario}")
    println("Salario com bonificação: ${hinata.bonificacao}")

    if(hinata.autentica(1234)) {
        println("Autenticado com sucesso!")
    } else {
        println("Falha na autenticação!")
    }

    println()

    val naruto = Diretor("Naruto", "45678932145", 1172, 200.00)
    naruto.salario = 2500.00
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

    println()

    val sakura = Analista(nome = "Sasuke", cpf = "78965413285")
    sakura.salario = 2100.50
    println("Analista: ${sakura.nome}")
    println("CPF: ${sakura.cpf}")
    println("Salario: ${sakura.salario}")
    println("Salario com bonificação: ${sakura.bonificacao}")

    println()

    val calculadora = CalculadoraBonificacao()

    println()

    calculadora.registra(kakashi)
    calculadora.registra(hinata)
    calculadora.registra(naruto)

    println("Total de bonificações: ${calculadora.total}")

}
